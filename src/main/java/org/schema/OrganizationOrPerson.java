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

import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.*;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
class OrganizationOrPerson {
  @JsonValue
  public Object getJsonLdValue() {
    if (myOrganization != null) return myOrganization;
    if (myPerson != null) return myPerson;
    return null;
  }
  public Thing getThing() {
    if (myOrganization != null) return myOrganization;
    if (myPerson != null) return myPerson;
    return null;
  }
  public void setOrganization(Organization organization) { clear(); myOrganization = organization; }
  public Organization getOrganization() { return myOrganization; }
  private Organization myOrganization;
  public void setPerson(Person person) { clear(); myPerson = person; }
  public Person getPerson() { return myPerson; }
  private Person myPerson;
  private void clear() {
    myOrganization = null;
    myPerson = null;
  }
}
