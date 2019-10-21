# Disconnect Project

_Disclaimer: this is work in progress_

Old but functional demo: https://disconnect-demo.herokuapp.com

## What?

**Disconnect** is a _framework_ to write offline-first mobile-ready applications 
in a pure Java. No GWT involved.

## Why?

Being a Java veteran, I was always looking for a way to build web-apps with Java. 
There are several UI frameworks out there, but they either use outdated technology,
or simply do not allow to create offline-first application without JavaScript.

## How?

At the heart of Disconnect lies [TeaVM](http://teavm.org/) -- ahead-of-time JVM
byte-code to JavaScript transpiler. (Well, it also does C, but that's out of scope
of this project). The most powerful features of TeaVM are metaprogramming helpers
(that allows you to emulate reflection without actual reflection) and class 
transformers, which provide a way to manipulate byte-code before transpilation. 
I use both.

_Again: this is still work in progress, the API and implementation is changing frequently,
so some of the details below might be out of sync with the reality._

## Offline-first?

Disconnect uses Vue as a frontend framework, for several reasons: it's relatively
fast, it's reactivity is more or less Java-friendly (compared to React) and it has
quite nice ecosystem of components (for example, Vuetify, which is used here). Normal stack of frontend tools is used to build
the actual app (Rollup, PostCSS, Babel, Terser, Workbox), so both application and
service worker are outputted.

## Online-second

Purely offline applications do not make any sense without backend where it can connect
and retrieve/submit data. And this is where Disconnect _excels_ (or, well, tries to).

# Features

## Write Vue components in Java

To create a new Vue component just subclass `Component` and annotate it with `@VueComponent`.

```java
@VueComponent
public class DemoApplicationShell extends Component {
//...
}

//...

@EntryPoint
public class DemoApplicationEntryPoint implements Runnable {

    @Override
    public void run() {
        VuetifyConfiguration configuration = VuetifyConfiguration.create();

        Theme darkTheme = configuration.buildDarkTheme();
        VaadinThemeColors.applyTo(darkTheme);

        Theme lightTheme = configuration.buildLightTheme();
        VaadinThemeColors.applyTo(lightTheme);

        configuration.useLightTheme();

        UI.addConfiguration("vuetify", Vuetify.configure(configuration));

        UI.run(DemoApplicationShell.class);
    }
} 
```

## Java "swing"-like UI building

Separation of render function and element tree allows to build and manipulate UI
with very small overhead: when you add component to layout, it'll be instantiated only
when the actual render will be called, and only once, as all components are keyed.

This allows to build and freely manipulate your UIs without caring on actual
DOM.

```java
    @Override
    public Element init() {
        VerticalLayout verticalLayout = new VerticalLayout();

        TextField textField = new TextField("Enter your name");
        textField.bind(this::getUserName, this::setUserName, true);

        Button button = new Button("Send to server");
        button.onClick(() -> {
            logMessage("Hello server, my name is " + userName, false);
            String greeting = greeter.hello(userName);
            logMessage(greeting, true);
        });

        log = new FadeTransition();
        log.setGroup(true);

        verticalLayout.add(textField, button, log);

        return verticalLayout;
    }
```

## Observe field changes

All component fields are made reactive by Vue. Note: no serialization/deserialization
is used, everything stored in a native TeaVM form, so you can have `long` and `Optional` 
there.

```java
@VueComponent
public class TestView extends Component {

    private String userName = "";

    @Override
    public Element init() {
        VerticalLayout verticalLayout = new VerticalLayout();

        TextField textField = new TextField("Enter your name");
        textField.bind(this::getUserName, this::setUserName, true);

        HtmlElement div = Element.of("div");
        observe(this::getUserName)
                .then((userName) -> div.setText("You typed: " + userName));
    }
}
```

## Vuex state management

Observation rules also applies to Vuex states. Have a close look to the excempt below:
it looks like you are calling normal `beginRequest` and `endRequest` methods, but in fact,
with a help of class transformers, in the runtime it will commit corresponding mutations.

That means, that you can use time-travel debugging! 

```java
@VuexState
public class LoadingState {
    private int activeRequestCount = 0;

    @Mutation
    public final void beginRequest() {
        activeRequestCount++;
    }

    @Mutation
    public final void endRequest() {
        activeRequestCount--;
    }

    public boolean hasActiveRequests() {
        return activeRequestCount>0;
    }
}

//...

    @InjectState
    private LoadingState loadingState;

//...

    try {
        loadingState.beginRequest();
        // Call backend service
    } finally {
        loadingState.endRequest();
    }

//...

    observe(() -> loadingState.hasActiveRequests()).then(loadingIndicator::setActive);
```

## LocalStorage support for Vuex states

Want to store some applilcation configuration? No problem. Just annotate state with 
`@PersistToLocalStorage` annotation.

```java
@VuexState
@PersistToLocalStorage
public class ApplicationConfiguration implements Serializable {
    public enum Theme { LIGHT, DARK }

    private Theme theme = Theme.LIGHT;

    @Mutation
    public final void setTheme(Theme theme) {
        this.theme = theme;
    }

    public boolean isDarkTheme() {
        return theme == Theme.DARK;
    }
}
```

## Data binding and validation

One thing I hate the most is to replicate same logic in frontend and backend. Especially
when it comes to field validation. That's why Disconnect supports `javax.validation` annotations
out of the box and uses the same Hibernate reference implementation for most of 
validators.

```java
class UserDetails {
    @NotNull
    @NotBlank
    @Email
    private String email;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 50)
    private String password;

    @NotNull
    @NotBlank
    @Size(min = 8, max = 50)
    private String confirmPassword;

    // getters and setters
}

//...

    private UserDetails details = new UserDetails();
    private TextField email = new TextField("Email address");
    private TextField password = new TextField("Type password");
    private TextField confirmPassword = new TextField("Type password again");

//...

    Binder<UserDetails> binder = Binder.bind(details,this);
    Button button = new Button("Submit");
    observe(binder::isValid).then(button::setEnabled);
```

## Routes

Routes with parameters are supported by using `@Route` annotation. 

Note: you must have `RouterView` element somewhere.

## Use Spring backend services

Last but not least: you can call backend services as if they are part
of frontend code. Consider the example below. It looks like you're injecting 
`GreeterService` with a `Resource` annotation, but internally the service
will be called via asynchronous RPC. 

As a bonus, caching and background sync via service worker can be configured with 
annotations. 

```java
@Service
public class GreeterService {
    private static final Logger log = LoggerFactory.getLogger(GreeterService.class);

    @AllowClientCalls
    public String hello(String userName) {
        log.info("Received message from client: [" + userName + "]");
        sleep(1000);
        return "Hello " + userName + ", I'm Java " + System.getProperty("java.version");
    }
}

//...

    @Resource
    private GreeterService greeter;

//...

    Button button = new Button("Send to server");
    button.onClick(() -> {
        logMessage("Hello server, my name is " + userName, false);
        String greeting = greeter.hello(userName);
        logMessage(greeting, true);
    });
``` 

## More low-level features

- Specify NPM dependencies with `@NpmPackage` annotations
- Import NPM modules via `@Import`/`@ImportObject` annotations
- Style module imports via `@ImportStyleModule` + `HasStyleModule`

## Roadmap

- Make type-safe java wrappers for all Vuetify components
- Switch to Webpack
- Investigate TeaVM incremental build + wds
- Proper documentation
- Spring security integration
- Encrypted RPC (for the one who cares of security)
- Sky is the limit