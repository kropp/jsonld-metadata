/*
 * Copyright 2015-2016 JetBrains s.r.o.
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

@com.fasterxml.jackson.databind.annotation.JsonSerialize(include = com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL)
class Number {
  @com.fasterxml.jackson.annotation.JsonValue
  public Object getJsonLdValue() {
    if (myInteger != null) return myInteger;
    if (myLong != null) return myLong;
    if (myFloat != null) return myFloat;
    if (myDouble != null) return myDouble;
    if (myString != null) return myString;
    return null;
  }
  public void setInteger(Integer integer) { clear(); myInteger = integer; }
  public Integer getInteger() { return myInteger; }
  private Integer myInteger;
  public void setLong(Long value) { clear(); myLong = value; }
  public Long getLong() { return myLong; }
  private Long myLong;
  public void setFloat(Float value) { clear(); myFloat = value; }
  public Float getFloat() { return myFloat; }
  private Float myFloat;
  public void setDouble(Double value) { clear(); myDouble = value; }
  public Double getDouble() { return myDouble; }
  private Double myDouble;
  public void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  private String myString;
  private void clear() {
    myInteger = null;
    myLong = null;
    myFloat = null;
    myDouble = null;
    myString = null;
  }
}
