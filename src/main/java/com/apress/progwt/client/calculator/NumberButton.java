/*
 * Copyright 2008 Jeff Dwyer
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.apress.progwt.client.calculator;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Widget;

public class NumberButton extends CalcButton implements ClickListener {

    private String value;
    private Calculator calculator;

    public NumberButton(Calculator calculator, String value) {
        super(value + "");
        this.value = value;
        this.calculator = calculator;
    }

    public NumberButton(Calculator calculator, int i) {
        this(calculator, "" + i);
    }

    public void onClick(Widget sender) {
        calculator.digitAction(value);
        explode();
    }

}
