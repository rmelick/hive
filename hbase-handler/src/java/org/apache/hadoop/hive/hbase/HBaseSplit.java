/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.hbase;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.FileSplit;
import org.apache.hadoop.mapred.InputSplit;
import org.apache.hadoop.hbase.mapred.TableSplit;

/**
 * HBaseSplit augments FileSplit with HBase column mapping.
 */
public class HBaseSplit extends FileSplit implements InputSplit {
  private String hbaseColumnMapping;
  private TableSplit split;
    
  public HBaseSplit() {
    super((Path) null, 0, 0, (String[]) null);
    hbaseColumnMapping = "";
    split = new TableSplit();
  }
    
  public HBaseSplit(TableSplit split, String columnsMapping, Path dummyPath) {
    super(dummyPath, 0, 0, (String[]) null);
    this.split = split;
    hbaseColumnMapping = columnsMapping;
  }
    
  public TableSplit getSplit() {
    return this.split;
  }
    
  public String getColumnsMapping() {
    return this.hbaseColumnMapping;
  }
    
  @Override
  public void readFields(DataInput in) throws IOException {
    super.readFields(in);
    hbaseColumnMapping = in.readUTF();
    split.readFields(in);
  }

  @Override
  public String toString() {
    return "TableSplit " + split + " : " + hbaseColumnMapping;
  }

  @Override
  public void write(DataOutput out) throws IOException {
    super.write(out);
    out.writeUTF(hbaseColumnMapping);
    split.write(out);
  }

  @Override
  public long getLength() {
    return split.getLength();
  }

  @Override
  public String[] getLocations() throws IOException {
    return split.getLocations();
  }
}
