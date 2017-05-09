/*
 * Copyright 2015-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This is auto-generated file. Do not edit.
 */

package org.schema;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enumerated status values for Order.
 */
public enum OrderStatus {
  OrderPickupAvailable("http://schema.org/OrderPickupAvailable"), OrderCancelled("http://schema.org/OrderCancelled"), OrderInTransit("http://schema.org/OrderInTransit"), OrderReturned("http://schema.org/OrderReturned"), OrderProcessing("http://schema.org/OrderProcessing"), OrderPaymentDue("http://schema.org/OrderPaymentDue"), OrderDelivered("http://schema.org/OrderDelivered"), OrderProblem("http://schema.org/OrderProblem");
  OrderStatus(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
