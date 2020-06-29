package js.lang.external.vaadin.vaadin_grid;

import com.github.fluorumlabs.disconnect.core.annotations.Import;
import com.github.fluorumlabs.disconnect.core.annotations.NpmPackage;
import js.lang.Any;
import js.lang.Unknown;
import js.util.Record;
import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSProperty;

import javax.annotation.Nullable;

@FunctionalInterface
@JSFunctor
@NpmPackage(
    name = "@vaadin/vaadin-grid",
    version = "^5.7.0-alpha4"
)
@Import(
    module = "@vaadin/vaadin-grid/vaadin-grid.js"
)
public interface GridDataProvider extends Any {
  void apply(ApplyParams params, GridDataProviderCallback callback);

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

    @JSProperty("parentItem")
    @Nullable
    Unknown /* string | Record < Unknown > */ getParentItem();

    @JSProperty("parentItem")
    void setParentItem(@Nullable String value);

    @JSProperty("parentItem")
    void setParentItem(@Nullable Record<Unknown> value);

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

      public ApplyParams.Builder parentItem(@Nullable String value) {
        object.setParentItem(value);
        return this;
      }

      public ApplyParams.Builder parentItem(@Nullable Record<Unknown> value) {
        object.setParentItem(value);
        return this;
      }
    }
  }
}
