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
 * The day of the week, e.g. used to specify to which day the opening hours of an OpeningHoursSpecification refer.
 * 
 * Originally, URLs from [GoodRelations](http://purl.org/goodrelations/v1) were used (for [[Monday]], [[Tuesday]], [[Wednesday]], [[Thursday]], [[Friday]], [[Saturday]], [[Sunday]] plus a special entry for [[PublicHolidays]]); these have now been integrated directly into schema.org.
 *       
 */
public enum DayOfWeek {
  Wednesday("http://schema.org/Wednesday"), Saturday("http://schema.org/Saturday"), Tuesday("http://schema.org/Tuesday"), Friday("http://schema.org/Friday"), Monday("http://schema.org/Monday"), PublicHolidays("http://schema.org/PublicHolidays"), Thursday("http://schema.org/Thursday"), Sunday("http://schema.org/Sunday");
  DayOfWeek(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
