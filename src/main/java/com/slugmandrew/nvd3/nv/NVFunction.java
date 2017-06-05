package com.slugmandrew.nvd3.nv;

import com.google.gwt.core.shared.GWT;
import com.slugmandrew.nvd3.util.JSObject;
import com.slugmandrew.nvd3.util.JSObjectHelper;

public class NVFunction
{
    public JSObject execute()
    {
        GWT.log("Abstract NVFunction called...");
        return JSObjectHelper.createObject();
    }

    public static void runMe()
    {
        GWT.log("RunMe called...");
    }

}
