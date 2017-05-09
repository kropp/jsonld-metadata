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
 * The business function specifies the type of activity or access (i.e., the bundle of rights) offered by the organization or business person through the offer. Typical are sell, rental or lease, maintenance or repair, manufacture / produce, recycle / dispose, engineering / construction, or installation. Proprietary specifications of access rights are also instances of this class.
 * 
 * Commonly used values:
 * 
 * * http://purl.org/goodrelations/v1#ConstructionInstallation
 * * http://purl.org/goodrelations/v1#Dispose
 * * http://purl.org/goodrelations/v1#LeaseOut
 * * http://purl.org/goodrelations/v1#Maintain
 * * http://purl.org/goodrelations/v1#ProvideService
 * * http://purl.org/goodrelations/v1#Repair
 * * http://purl.org/goodrelations/v1#Sell
 * * http://purl.org/goodrelations/v1#Buy
 *         
 */
public enum BusinessFunction {
  ;
  BusinessFunction(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
