package com.slugmandrew.nvd3.html;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

/**
 * This panel represents an SVG tag with namespace. Without namespace dynamically created svg is not rendered,
 * because svg is xml(xhtml) and normal page is html. To workaround this cleverness, we need to define a namespace
 * for the svg panel...
 * 
 * @author hu3b11v1
 *
 */
public class SVG extends Widget
{
	public static final String SVG_NAMESPACE = "http://www.w3.org/2000/svg";
	
	public SVG()
	{
		setElement(createElementNS(SVG_NAMESPACE, "svg"));
	}
	
	public static native Element createElementNS(final String ns, final String name)/*-{
		return document.createElementNS(ns, name);
	}-*/;
	
}
