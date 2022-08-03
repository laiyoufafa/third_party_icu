/*
 * Copyright (c) 2021 Huawei Device Co., Ltd.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include "init_data.h"

#include <mutex>

namespace {
const char* g_hwDirectory = "/system/usr/ohos_icu";
static int status = 0;
std::mutex dataMutex;
}

/**
 * set icu data files to hwDirectory
 */
void SetHwIcuDirectory( )
{
    std::lock_guard<std::mutex> lock(dataMutex);
    if (status != 0) {
        return;
    }
    u_setDataDirectory(g_hwDirectory);
    status = 1;
}
