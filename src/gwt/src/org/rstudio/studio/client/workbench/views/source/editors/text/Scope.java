/*
 * Scope.java
 *
 * Copyright (C) 2009-12 by RStudio, Inc.
 *
 * This program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.workbench.views.source.editors.text;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.rstudio.studio.client.workbench.views.source.editors.text.ace.Position;

public class Scope extends JavaScriptObject
{
   protected Scope()
   {}

   public native final String getLabel() /*-{
      return this.label;
   }-*/;

   public native final boolean isTopLevel() /*-{
      return this.isRoot();
   }-*/;

   public native final boolean isBrace() /*-{
      return this.isBrace();
   }-*/;

   public native final boolean isChunk() /*-{
      return this.isChunk();
   }-*/;

   public native final boolean isSection() /*-{
      return this.isSection();
   }-*/;

   /**
    * For named functions, the preamble points to the beginning of the function
    * declaration, including function name. For other scopes, it just points to
    * the opening brace (same as getBraceStart).
    */
   public native final Position getPreamble() /*-{
      return this.preamble;
   }-*/;

   /**
    * Points to the opening brace of the scope. Note that for named functions,
    * this is different than the preamble.
    */
   public native final Position getBraceStart() /*-{
      return this.start;
   }-*/;

   public native final Position getEnd() /*-{
      return this.end;
   }-*/;

   public native final JsArray<Scope> getChildren() /*-{
      return this.$children;
   }-*/;

   public native final String getChunkLabel() /*-{
      return this.chunkLabel;
   }-*/;

}
