/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appium.java_client.ios;

import static io.appium.java_client.touch.WebElementOption.element;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.ActionOptions;
import io.appium.java_client.touch.PositionOffsetOption;
import io.appium.java_client.touch.WebElementOption;
import org.openqa.selenium.WebElement;

public class IOSTouchAction extends TouchAction<IOSTouchAction> {

    public IOSTouchAction(PerformsTouchActions performsTouchActions) {
        super(performsTouchActions);
    }

    /**
     * Double taps an element, offset from upper left corner.
     *
     * @param el element to tap.
     * @param x  x offset.
     * @param y  y offset.
     * @return this IOSTouchAction, for chaining.
     * @deprecated use {@link #tap(PositionOffsetOption)} with count=2 instead.
     */
    @Deprecated
    public IOSTouchAction doubleTap(WebElement el, int x, int y) {
        return doubleTap(element(el, x, y));
    }

    /**
     * Double taps an element, offset from upper left corner.
     *
     * @param el element to tap.
     * @return this IOSTouchAction, for chaining.
     * @deprecated use {@link #tap(PositionOffsetOption)} with count=2 instead.
     */
    @Deprecated
    public IOSTouchAction doubleTap(WebElement el) {
        return doubleTap(element(el));
    }

    /**
     * Double taps using relative offset from an element.
     *
     * @param doubleTapOption is the relative offset parameter from the element.
     *                        see {@link WebElementOption} and {@link PositionOffsetOption}.
     * @return self-reference
     */
    public <S extends WebElementOption> IOSTouchAction doubleTap(ActionOptions<? super S> doubleTapOption) {
        ActionParameter action = new ActionParameter("doubleTap",
                doubleTapOption);
        parameterBuilder.add(action);
        return this;
    }
}
