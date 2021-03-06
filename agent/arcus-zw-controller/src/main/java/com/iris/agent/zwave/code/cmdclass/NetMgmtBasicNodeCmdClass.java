/*
 * Copyright 2019 Arcus Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.iris.agent.zwave.code.cmdclass;

import com.iris.agent.zwave.code.anno.Id;
import com.iris.agent.zwave.code.anno.Name;
import com.iris.agent.zwave.code.cmds.NetMgmtBasicLearnModeSetCmd;
import com.iris.agent.zwave.code.cmds.NetMgmtBasicNodeInfoSendCmd;

@Id(0x4d)
@Name("Network Management Basic Node")
public class NetMgmtBasicNodeCmdClass extends AbstractCmdClass {
   public static final int CMD_LEARN_MODE_SET = 0x01;
   public static final int CMD_NODE_INFO_SEND = 0x05;
   
   NetMgmtBasicNodeCmdClass() {
      super(
         new NetMgmtBasicNodeInfoSendCmd(),
         new NetMgmtBasicLearnModeSetCmd()
            );
      
   }
}

