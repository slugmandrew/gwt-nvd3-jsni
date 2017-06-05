package com.slugmandrew.nvd3.nv;

import com.slugmandrew.nvd3.nv.model.Chart;
import com.slugmandrew.nvd3.util.JSObject;
import com.slugmandrew.nvd3.util.JSObjectWrapper;

public class NVModel extends JSObjectWrapper
{
	public NVModel(JSObject object) {
		super(object);
	}

	public Chart getDiscreteBarChart() {
		return new Chart(NVModelImpl.getDiscreteBarChart(getJSObject()));
	}

	public Chart getMultiBarHorizontalChart() {
		return new Chart(NVModelImpl.getMultiBarHorizontalChart(getJSObject()));
	}

	public Chart getMultiBarChart() {
		return new Chart(NVModelImpl.getMultiBarChart(getJSObject()));
	}
	
	public Chart getLineChart(){
		return new Chart(NVModelImpl.getLineChart(getJSObject()));
	}

	public Chart getStackedAreaChart(){
		return new Chart(NVModelImpl.getStackedAreaChart(getJSObject()));
	}
	
	public Chart getPieChart(){
		return new Chart(NVModelImpl.getPieChart(getJSObject()));
	}
	
	public Chart getLineWithFocusChart(){
		return new Chart(NVModelImpl.getLineWithFocusChart(getJSObject()));
	}
	
}
