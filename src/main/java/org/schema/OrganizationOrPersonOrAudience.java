/*
 * Copyright 2015 JetBrains s.r.o.
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
 * Generated on Jul 22, 2015.
 */

package org.schema;

class OrganizationOrPersonOrAudience {
  public Thing getThing() {
    if (myOrganization != null) return myOrganization;
    if (myPerson != null) return myPerson;
    if (myAudience != null) return myAudience;
    return null;
  }
  public void setOrganization(Organization organization) { clear(); myOrganization = organization; }
  public Organization getOrganization() { return myOrganization; }
  private Organization myOrganization;
  public void setPerson(Person person) { clear(); myPerson = person; }
  public Person getPerson() { return myPerson; }
  private Person myPerson;
  public void setAudience(Audience audience) { clear(); myAudience = audience; }
  public Audience getAudience() { return myAudience; }
  private Audience myAudience;
  private void clear() {
    myOrganization = null;
    myPerson = null;
    myAudience = null;
  }
}