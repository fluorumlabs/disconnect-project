package js.lang.external.vaadin.vaadin_crud;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.external.vaadin.vaadin_grid.GridFilter;
import js.lang.external.vaadin.vaadin_grid.GridSorter;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "@vaadin/vaadin-crud",
    version = "^1.3.0-alpha2"
)
@Import(
    module = "@vaadin/vaadin-crud/vaadin-crud.js"
)
public interface CrudDataProvider extends Any {
  void apply(ApplyParams params, CrudDataProviderCallback callback);

  interface ApplyParams extends Any {
    @JSProperty("page")
    double getPage();

    @JSProperty("page")
    void setPage(double value);

    @JSProperty("pageSize")
    double getPageSize();

    @JSProperty("pageSize")
    void setPageSize(double value);

    @JSProperty("filters")
    GridFilter[] getFilters();

    @JSProperty("filters")
    void setFilters(GridFilter... value);

    @JSProperty("sortOrders")
    GridSorter[] getSortOrders();

    @JSProperty("sortOrders")
    void setSortOrders(GridSorter... value);

    static ApplyParams.Builder builder() {
      return new ApplyParams.Builder();
    }

    final class Builder {
      private final ApplyParams object = Any.empty();

      private Builder() {
      }

      public ApplyParams build() {
        return object;
      }

      public ApplyParams.Builder page(double value) {
        object.setPage(value);
        return this;
      }

      public ApplyParams.Builder pageSize(double value) {
        object.setPageSize(value);
        return this;
      }

      public ApplyParams.Builder filters(GridFilter... value) {
        object.setFilters(value);
        return this;
      }

      public ApplyParams.Builder sortOrders(GridSorter... value) {
        object.setSortOrders(value);
        return this;
      }
    }
  }
}
