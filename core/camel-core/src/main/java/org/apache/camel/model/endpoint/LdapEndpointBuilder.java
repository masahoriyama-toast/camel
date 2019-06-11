/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import javax.annotation.Generated;
import org.apache.camel.model.AbstractEndpointBuilder;
import org.apache.camel.model.EndpointConsumerBuilder;
import org.apache.camel.model.EndpointProducerBuilder;

/**
 * The ldap component allows you to perform searches in LDAP servers using
 * filters as the message payload.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LdapEndpointBuilder {


    public static class LdapCommonBuilder<T extends AbstractEndpointBuilder>
            extends
                AbstractEndpointBuilder<T> {
        LdapCommonBuilder(String path) {
            super("ldap", path);
        }
        /**
         * Name of either a javax.naming.directory.DirContext, or
         * java.util.Hashtable, or Map bean to lookup in the registry. If the
         * bean is either a Hashtable or Map then a new
         * javax.naming.directory.DirContext instance is created for each use.
         * If the bean is a javax.naming.directory.DirContext then the bean is
         * used as given. The latter may not be possible in all situations where
         * the javax.naming.directory.DirContext must not be shared, and in
         * those situations it can be better to use java.util.Hashtable or Map
         * instead. The option is a java.lang.String type.
         */
        public T dirContextName(String dirContextName) {
            this.properties.put("dirContextName", dirContextName);
            return (T) this;
        }
        /**
         * The base DN for searches. The option is a java.lang.String type.
         */
        public T base(String base) {
            this.properties.put("base", base);
            return (T) this;
        }
        /**
         * When specified the ldap module uses paging to retrieve all results
         * (most LDAP Servers throw an exception when trying to retrieve more
         * than 1000 entries in one query). To be able to use this a LdapContext
         * (subclass of DirContext) has to be passed in as ldapServerBean
         * (otherwise an exception is thrown). The option is a java.lang.Integer
         * type.
         */
        public T pageSize(Integer pageSize) {
            this.properties.put("pageSize", pageSize);
            return (T) this;
        }
        /**
         * When specified the ldap module uses paging to retrieve all results
         * (most LDAP Servers throw an exception when trying to retrieve more
         * than 1000 entries in one query). To be able to use this a LdapContext
         * (subclass of DirContext) has to be passed in as ldapServerBean
         * (otherwise an exception is thrown). The option will be converted to a
         * java.lang.Integer type.
         */
        public T pageSize(String pageSize) {
            this.properties.put("pageSize", pageSize);
            return (T) this;
        }
        /**
         * Comma-separated list of attributes that should be set in each entry
         * of the result. The option is a java.lang.String type.
         */
        public T returnedAttributes(String returnedAttributes) {
            this.properties.put("returnedAttributes", returnedAttributes);
            return (T) this;
        }
        /**
         * Specifies how deeply to search the tree of entries, starting at the
         * base DN. The option is a java.lang.String type.
         */
        public T scope(String scope) {
            this.properties.put("scope", scope);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * will be converted to a boolean type.
         */
        public T basicPropertyBinding(String basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * will be converted to a boolean type.
         */
        public T synchronous(String synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class LdapProducerBuilder
            extends
                LdapCommonBuilder<LdapProducerBuilder>
            implements
                EndpointProducerBuilder {
        public LdapProducerBuilder(String path) {
            super(path);
        }
    }
    public default LdapProducerBuilder toLdap(String path) {
        return new LdapProducerBuilder(path);
    }
}