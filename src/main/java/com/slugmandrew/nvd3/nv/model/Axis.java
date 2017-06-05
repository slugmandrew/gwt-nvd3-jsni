package com.slugmandrew.nvd3.nv.model;

import com.slugmandrew.nvd3.util.JSObject;
import com.slugmandrew.nvd3.util.JSObjectWrapper;

public class Axis extends JSObjectWrapper
{

    public Axis(JSObject object)
    {
        super(object);
    }

    public Axis setTickFormat(String value)
    {
        AxisImpl.setTickFormat(getJSObject(), value);
        return this;
    }

    public Axis setTickFormatAsDate()
    {
        AxisImpl.setTickFormatAsDate(getJSObject());
        return this;
    }

    public Axis setAxisLabel(String value)
    {
        AxisImpl.setAxisLabel(getJSObject(), value);
        return this;
    }

}
