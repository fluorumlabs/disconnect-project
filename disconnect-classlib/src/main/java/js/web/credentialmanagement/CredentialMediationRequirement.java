package js.web.credentialmanagement;

import js.extras.JsEnum;


public abstract class CredentialMediationRequirement extends JsEnum {
    public static final CredentialMediationRequirement SILENT = JsEnum.of("silent");

    public static final CredentialMediationRequirement OPTIONAL = JsEnum.of("optional");

    public static final CredentialMediationRequirement REQUIRED = JsEnum.of("required");
}
