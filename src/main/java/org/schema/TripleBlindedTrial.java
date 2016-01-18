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
import org.jetbrains.annotations.*;

/**
 * A trial design in which neither the researcher, the person administering the therapy nor the patient knows the details of the treatment the patient was randomly assigned to.
 */
public class TripleBlindedTrial {
  /**
   * Builder for {@link TripleBlindedTrial}
   */
  static final class TripleBlindedTrialThingBuilder implements Builder {
    /**
     * Creates new {@link TripleBlindedTrial} instance.
     */
    public TripleBlindedTrial build() {
      return new TripleBlindedTrial();
    }
  }
  public interface Builder extends ThingBuilder<TripleBlindedTrial> {
    
  }

  protected TripleBlindedTrial() {
  }
}
