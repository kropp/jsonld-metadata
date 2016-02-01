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

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Number {
  void setInteger(Integer integer) { clear(); myInteger = integer; }
  public Integer getInteger() { return myInteger; }
  void setLong(Long value) { clear(); myLong = value; }
  public Long getLong() { return myLong; }
  void setFloat(Float value) { clear(); myFloat = value; }
  public Float getFloat() { return myFloat; }
  void setDouble(Double value) { clear(); myDouble = value; }
  public Double getDouble() { return myDouble; }
  void setString(String value) { clear(); myString = value; }
  public String getString() { return myString; }
  @com.fasterxml.jackson.annotation.JsonValue public Object getJsonLdValue() {
    if (myInteger != null) return myInteger;
    if (myLong != null) return myLong;
    if (myFloat != null) return myFloat;
    if (myDouble != null) return myDouble;
    if (myString != null) return myString;
    return null;
  }
  public void clear() {
    myInteger = null;
    myLong = null;
    myFloat = null;
    myDouble = null;
    myString = null;
  }
  @Override public int hashCode() {
    int result = 0;
    result = 31 * result + (myInteger != null ? myInteger.hashCode() : 0);
    result = 31 * result + (myLong != null ? myLong.hashCode() : 0);
    result = 31 * result + (myFloat != null ? myFloat.hashCode() : 0);
    result = 31 * result + (myDouble != null ? myDouble.hashCode() : 0);
    result = 31 * result + (myString != null ? myString.hashCode() : 0);
    return result;
  }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Number number = (Number) o;
    if (myInteger != null ? !myInteger.equals(number.myInteger) : number.myInteger != null) return false;
    if (myLong != null ? !myLong.equals(number.myLong) : number.myLong != null) return false;
    if (myFloat != null ? !myFloat.equals(number.myFloat) : number.myFloat != null) return false;
    if (myDouble != null ? !myDouble.equals(number.myDouble) : number.myDouble != null) return false;
    if (myString != null ? !myString.equals(number.myString) : number.myString != null) return false;
    return true;
  }
  private Integer myInteger;
  private Long myLong;
  private Float myFloat;
  private Double myDouble;
  private String myString;
}
