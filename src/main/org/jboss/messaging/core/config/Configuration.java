/*
 * JBoss, Home of Professional Open Source
 * Copyright 2005, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.messaging.core.config;

import java.util.List;

import org.jboss.messaging.core.remoting.TransportType;
import org.jboss.messaging.core.server.JournalType;
import org.jboss.messaging.core.client.Location;
import org.jboss.messaging.core.client.ConnectionParams;

/**
 * 
 * A Configuration
 * 
 * @author <a href="mailto:tim.fox@jboss.com">Tim Fox</a>
 *
 */
public interface Configuration
{
   List<String> getDefaultInterceptors();

   Boolean isClustered();

   Integer getScheduledThreadPoolMaxSize();

   long getSecurityInvalidationInterval();

   TransportType getTransport();

   String getHost();

   int getPort();

   Location getLocation();

   /**
    * The server ID is used only when the messaging server
    * is started in INVM transport. 
    */
   int getServerID();
   
   boolean isTcpNoDelay();
   
   int getTcpReceiveBufferSize();

   int getTcpSendBufferSize();

   long getKeepAliveInterval();

   long getKeepAliveTimeout();

   long getTimeout();
   
   long getWriteQueueMaxBytes();

   long getWriteQueueMinBytes();
   
   long getWriteQueueBlockTimeout();
      
   boolean isSecurityEnabled();

   String getKeyStorePath();

   String getKeyStorePassword();

   String getTrustStorePath();

   String getTrustStorePassword();

   boolean isInvmDisabled();

   boolean isSSLEnabled();

   String getURI();

   String getBindingsDirectory();

   String getJournalDirectory();

   JournalType getJournalType();

   boolean isJournalSync();

   int getJournalFileSize();

   int getJournalMinFiles();
   
   int getJournalMaxAIO();
   
   long getJournalAIOTimeout();
   
   void setJournalMaxAIO(int max);

   long getJournalTaskPeriod();

   boolean isCreateBindingsDir();

   boolean isCreateJournalDir();

   boolean isRequireDestinations();

   ConnectionParams getConnectionParams();
}
