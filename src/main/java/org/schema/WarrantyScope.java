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
 * A range of of services that will be provided to a customer free of charge in case of a defect or malfunction of a product.
 * 
 * Commonly used values:
 * 
 * * http://purl.org/goodrelations/v1#Labor-BringIn
 * * http://purl.org/goodrelations/v1#PartsAndLabor-BringIn
 * * http://purl.org/goodrelations/v1#PartsAndLabor-PickUp
 *       
 */
public enum WarrantyScope {
  ;
  WarrantyScope(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
