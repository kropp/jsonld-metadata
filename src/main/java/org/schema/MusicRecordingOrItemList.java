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

class MusicRecordingOrItemList {
  public Thing getThing() {
    if (myMusicRecording != null) return myMusicRecording;
    if (myItemList != null) return myItemList;
    return null;
  }
  public void setMusicRecording(MusicRecording musicRecording) { clear(); myMusicRecording = musicRecording; }
  public MusicRecording getMusicRecording() { return myMusicRecording; }
  private MusicRecording myMusicRecording;
  public void setItemList(ItemList itemList) { clear(); myItemList = itemList; }
  public ItemList getItemList() { return myItemList; }
  private ItemList myItemList;
  private void clear() {
    myMusicRecording = null;
    myItemList = null;
  }
}
