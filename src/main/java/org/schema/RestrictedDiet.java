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
 * A diet restricted to certain foods or preparations for cultural, religious, health or lifestyle reasons. 
 */
public enum RestrictedDiet {
  DiabeticDiet("http://schema.org/DiabeticDiet"), LowSaltDiet("http://schema.org/LowSaltDiet"), KosherDiet("http://schema.org/KosherDiet"), HalalDiet("http://schema.org/HalalDiet"), HinduDiet("http://schema.org/HinduDiet"), LowLactoseDiet("http://schema.org/LowLactoseDiet"), VeganDiet("http://schema.org/VeganDiet"), VegetarianDiet("http://schema.org/VegetarianDiet"), GlutenFreeDiet("http://schema.org/GlutenFreeDiet"), LowFatDiet("http://schema.org/LowFatDiet"), LowCalorieDiet("http://schema.org/LowCalorieDiet");
  RestrictedDiet(String value) {
    myValue = value;
  }
  @JsonValue
  public String getValue() { return myValue; }
  private String myValue;
}
