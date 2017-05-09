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
 * A payment method is a standardized procedure for transferring the monetary amount for a purchase. Payment methods are characterized by the legal and technical structures used, and by the organization or group carrying out the transaction.
 * 
 * Commonly used values:
 * 
 * * http://purl.org/goodrelations/v1#ByBankTransferInAdvance
 * * http://purl.org/goodrelations/v1#ByInvoice
 * * http://purl.org/goodrelations/v1#Cash
 * * http://purl.org/goodrelations/v1#CheckInAdvance
 * * http://purl.org/goodrelations/v1#COD
 * * http://purl.org/goodrelations/v1#DirectDebit
 * * http://purl.org/goodrelations/v1#GoogleCheckout
 * * http://purl.org/goodrelations/v1#PayPal
 * * http://purl.org/goodrelations/v1#PaySwarm
 *         
 */
public enum PaymentMethod {
  PaymentCard("http://schema.org/PaymentCard");
  PaymentMethod(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
