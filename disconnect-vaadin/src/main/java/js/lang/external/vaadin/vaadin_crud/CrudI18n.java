package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import java.lang.String;
import js.lang.Any;
import org.teavm.jso.JSProperty;

@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-crud/vaadin-crud.js"
)
public interface CrudI18n extends Any {
  @JSProperty("newItem")
  String getNewItem();

  @JSProperty("newItem")
  void setNewItem(String value);

  @JSProperty("editItem")
  String getEditItem();

  @JSProperty("editItem")
  void setEditItem(String value);

  @JSProperty("saveItem")
  String getSaveItem();

  @JSProperty("saveItem")
  void setSaveItem(String value);

  @JSProperty("cancel")
  String getCancel();

  @JSProperty("cancel")
  void setCancel(String value);

  @JSProperty("deleteItem")
  String getDeleteItem();

  @JSProperty("deleteItem")
  void setDeleteItem(String value);

  @JSProperty("editLabel")
  String getEditLabel();

  @JSProperty("editLabel")
  void setEditLabel(String value);

  @JSProperty("confirm")
  Confirm getConfirm();

  @JSProperty("confirm")
  void setConfirm(Confirm value);

  interface Confirm extends Any {
    @JSProperty("delete")
    Delete getDelete();

    @JSProperty("delete")
    void setDelete(Delete value);

    @JSProperty("cancel")
    Cancel getCancel();

    @JSProperty("cancel")
    void setCancel(Cancel value);

    interface Delete extends Any {
      @JSProperty("title")
      String getTitle();

      @JSProperty("title")
      void setTitle(String value);

      @JSProperty("content")
      String getContent();

      @JSProperty("content")
      void setContent(String value);

      @JSProperty("button")
      Button getButton();

      @JSProperty("button")
      void setButton(Button value);

      interface Button extends Any {
        @JSProperty("confirm")
        String getConfirm();

        @JSProperty("confirm")
        void setConfirm(String value);

        @JSProperty("dismiss")
        String getDismiss();

        @JSProperty("dismiss")
        void setDismiss(String value);

        class Builder {
          private final Button object = Any.empty();

          public Button build() {
            return object;
          }

          public Button.Builder confirm(String value) {
            object.setConfirm(value);
            return this;
          }

          public Button.Builder dismiss(String value) {
            object.setDismiss(value);
            return this;
          }
        }
      }

      class Builder {
        private final Delete object = Any.empty();

        public Delete build() {
          return object;
        }

        public Delete.Builder title(String value) {
          object.setTitle(value);
          return this;
        }

        public Delete.Builder content(String value) {
          object.setContent(value);
          return this;
        }

        public Delete.Builder button(Button value) {
          object.setButton(value);
          return this;
        }
      }
    }

    interface Cancel extends Any {
      @JSProperty("title")
      String getTitle();

      @JSProperty("title")
      void setTitle(String value);

      @JSProperty("content")
      String getContent();

      @JSProperty("content")
      void setContent(String value);

      @JSProperty("button")
      Button getButton();

      @JSProperty("button")
      void setButton(Button value);

      interface Button extends Any {
        @JSProperty("confirm")
        String getConfirm();

        @JSProperty("confirm")
        void setConfirm(String value);

        @JSProperty("dismiss")
        String getDismiss();

        @JSProperty("dismiss")
        void setDismiss(String value);

        class Builder {
          private final Button object = Any.empty();

          public Button build() {
            return object;
          }

          public Button.Builder confirm(String value) {
            object.setConfirm(value);
            return this;
          }

          public Button.Builder dismiss(String value) {
            object.setDismiss(value);
            return this;
          }
        }
      }

      class Builder {
        private final Cancel object = Any.empty();

        public Cancel build() {
          return object;
        }

        public Cancel.Builder title(String value) {
          object.setTitle(value);
          return this;
        }

        public Cancel.Builder content(String value) {
          object.setContent(value);
          return this;
        }

        public Cancel.Builder button(Button value) {
          object.setButton(value);
          return this;
        }
      }
    }

    class Builder {
      private final Confirm object = Any.empty();

      public Confirm build() {
        return object;
      }

      public Confirm.Builder delete(Delete value) {
        object.setDelete(value);
        return this;
      }

      public Confirm.Builder cancel(Cancel value) {
        object.setCancel(value);
        return this;
      }
    }
  }

  class Builder {
    private final CrudI18n object = Any.empty();

    public CrudI18n build() {
      return object;
    }

    public Builder newItem(String value) {
      object.setNewItem(value);
      return this;
    }

    public Builder editItem(String value) {
      object.setEditItem(value);
      return this;
    }

    public Builder saveItem(String value) {
      object.setSaveItem(value);
      return this;
    }

    public Builder cancel(String value) {
      object.setCancel(value);
      return this;
    }

    public Builder deleteItem(String value) {
      object.setDeleteItem(value);
      return this;
    }

    public Builder editLabel(String value) {
      object.setEditLabel(value);
      return this;
    }

    public Builder confirm(Confirm value) {
      object.setConfirm(value);
      return this;
    }
  }
}
