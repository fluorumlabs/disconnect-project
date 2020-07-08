package com.github.fluorumlabs.disconnect.vaadin.combobox;

import com.github.fluorumlabs.disconnect.core.components.HtmlComponent;
import js.lang.external.vaadin.combobox.ComboBoxItemElement;
import com.github.fluorumlabs.disconnect.core.annotations.CustomElement;

/**
 * The default element used for items in the vaadin-combo-box.
 *
 * <h3>Styling</h3>
 * The following shadow DOM parts are available for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Part name</th>
 *    <th>Description</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>content</code></td>
 *    <td>The element that wraps the item label or template content</td>
 *   </tr>
 *  </tbody>
 * </table>
 * The following state attributes are exposed for styling:
 *
 * <table>
 *  <thead>
 *   <tr>
 *    <th>Attribute</th>
 *    <th>Description</th>
 *    <th>Part name</th>
 *   </tr>
 *  </thead>
 *  <tbody>
 *   <tr>
 *    <td><code>selected</code></td>
 *    <td>Set when the item is selected</td>
 *    <td>:host</td>
 *   </tr>
 *   <tr>
 *    <td><code>focused</code></td>
 *    <td>Set when the item is focused</td>
 *    <td>:host</td>
 *   </tr>
 *  </tbody>
 * </table>
 * See <a href="https://github.com/vaadin/vaadin-themable-mixin/wiki">ThemableMixin â€“ how to apply styles for shadow parts</a>
 *
 * <strong>Mixins:</strong> ThemableMixin, DirMixin, ElementMixin
 */
class ComboBoxItem extends HtmlComponent<ComboBoxItemElement> {

    // !wca! get focused: boolean

    // !wca! set focused: boolean

    // !wca! observe focused: boolean

    // !wca! get index: number

    // !wca! set index: number

    // !wca! observe index: number

    // !wca! get item: (String|Object)

    // !wca! set item: (String|Object)

    // !wca! observe item: (String|Object)

    // !wca! get label: string

    // !wca! set label: string

    // !wca! observe label: string

    // !wca! get renderer: ?

    // !wca! set renderer: ?

    // !wca! observe renderer: ?

    // !wca! get selected: boolean

    // !wca! set selected: boolean

    // !wca! observe selected: boolean

    // !wca! get theme: string | null | undefined

    // !wca! observe theme: string | null | undefined
}
