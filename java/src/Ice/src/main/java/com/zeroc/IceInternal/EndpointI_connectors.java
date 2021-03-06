// **********************************************************************
//
// Copyright (c) 2003-2017 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

package com.zeroc.IceInternal;

public interface EndpointI_connectors
{
    void connectors(java.util.List<Connector> connectors);
    void exception(com.zeroc.Ice.LocalException ex);
}
