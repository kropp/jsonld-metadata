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
class MedicalProcedureOrMedicalTestOrMedicalTherapy {
  @com.fasterxml.jackson.annotation.JsonValue
  public Object getJsonLdValue() {
    if (myMedicalProcedure != null) return myMedicalProcedure;
    if (myMedicalTest != null) return myMedicalTest;
    if (myMedicalTherapy != null) return myMedicalTherapy;
    return null;
  }
  public Thing getThing() {
    if (myMedicalProcedure != null) return myMedicalProcedure;
    if (myMedicalTest != null) return myMedicalTest;
    if (myMedicalTherapy != null) return myMedicalTherapy;
    return null;
  }
  public void setMedicalProcedure(MedicalProcedure medicalProcedure) { clear(); myMedicalProcedure = medicalProcedure; }
  public MedicalProcedure getMedicalProcedure() { return myMedicalProcedure; }
  private MedicalProcedure myMedicalProcedure;
  public void setMedicalTest(MedicalTest medicalTest) { clear(); myMedicalTest = medicalTest; }
  public MedicalTest getMedicalTest() { return myMedicalTest; }
  private MedicalTest myMedicalTest;
  public void setMedicalTherapy(MedicalTherapy medicalTherapy) { clear(); myMedicalTherapy = medicalTherapy; }
  public MedicalTherapy getMedicalTherapy() { return myMedicalTherapy; }
  private MedicalTherapy myMedicalTherapy;
  private void clear() {
    myMedicalProcedure = null;
    myMedicalTest = null;
    myMedicalTherapy = null;
  }
}
