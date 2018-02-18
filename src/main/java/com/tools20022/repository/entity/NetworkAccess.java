/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Parameters used to access a network.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="NetworkAccess" src="doc-files/NetworkAccess.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmHostIPAddress
 * NetworkAccess.mmHostIPAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmHostPortNumber
 * NetworkAccess.mmHostPortNumber}</li>
 * <li>{@linkplain com.tools20022.repository.entity.NetworkAccess#mmUserName
 * NetworkAccess.mmUserName}</li>
 * <li>{@linkplain com.tools20022.repository.entity.NetworkAccess#mmAccessCode
 * NetworkAccess.mmAccessCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmClientCertificate
 * NetworkAccess.mmClientCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmTerminalManagementSystem
 * NetworkAccess.mmTerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmNetworkAddress
 * NetworkAccess.mmNetworkAddress}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmNetworkAccess
 * SecurityCertificate.mmNetworkAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmNetworkAccess
 * TerminalManagementSystem.mmNetworkAccess}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetworkAccess"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters used to access a network."</li>
 * </ul>
 */
public class NetworkAccess {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text hostIPAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess NetworkAccess}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostIPAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "IP address of the host."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHostIPAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HostIPAddress";
			definition = "IP address of the host.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetworkAccess.class.getMethod("getHostIPAddress", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number hostPortNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess NetworkAccess}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostPortNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Port number of the host."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHostPortNumber = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HostPortNumber";
			definition = "Port number of the host.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetworkAccess.class.getMethod("getHostPortNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text userName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess NetworkAccess}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UserName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "User name identifying the party accessing the network."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUserName = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UserName";
			definition = "User name identifying the party accessing the network.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetworkAccess.class.getMethod("getUserName", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text accessCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess NetworkAccess}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccessCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Password authenticating the user"</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAccessCode = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AccessCode";
			definition = "Password authenticating the user";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetworkAccess.class.getMethod("getAccessCode", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecurityCertificate> clientCertificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmNetworkAccess
	 * SecurityCertificate.mmNetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecurityCertificate
	 * SecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess NetworkAccess}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Client certificate chain."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClientCertificate = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientCertificate";
			definition = "Client certificate chain.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmNetworkAccess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmObject();
		}
	};
	protected TerminalManagementSystem terminalManagementSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmNetworkAccess
	 * TerminalManagementSystem.mmNetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess NetworkAccess}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal Management System which uses the network."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal Management System which uses the network.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmNetworkAccess;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};
	protected Max1025Text networkAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess NetworkAccess}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address used to reach the network on which a message will be carried."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetworkAddress = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetworkAddress";
			definition = "Address used to reach the network on which a message will be carried.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetworkAccess.class.getMethod("getNetworkAddress", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetworkAccess";
				definition = "Parameters used to access a network.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecurityCertificate.mmNetworkAccess, com.tools20022.repository.entity.TerminalManagementSystem.mmNetworkAccess);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetworkAccess.mmHostIPAddress, com.tools20022.repository.entity.NetworkAccess.mmHostPortNumber, com.tools20022.repository.entity.NetworkAccess.mmUserName,
						com.tools20022.repository.entity.NetworkAccess.mmAccessCode, com.tools20022.repository.entity.NetworkAccess.mmClientCertificate, com.tools20022.repository.entity.NetworkAccess.mmTerminalManagementSystem,
						com.tools20022.repository.entity.NetworkAccess.mmNetworkAddress);
			}

			@Override
			public Class<?> getInstanceClass() {
				return NetworkAccess.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getHostIPAddress() {
		return hostIPAddress;
	}

	public NetworkAccess setHostIPAddress(Max35Text hostIPAddress) {
		this.hostIPAddress = Objects.requireNonNull(hostIPAddress);
		return this;
	}

	public Number getHostPortNumber() {
		return hostPortNumber;
	}

	public NetworkAccess setHostPortNumber(Number hostPortNumber) {
		this.hostPortNumber = Objects.requireNonNull(hostPortNumber);
		return this;
	}

	public Max35Text getUserName() {
		return userName;
	}

	public NetworkAccess setUserName(Max35Text userName) {
		this.userName = Objects.requireNonNull(userName);
		return this;
	}

	public Max35Text getAccessCode() {
		return accessCode;
	}

	public NetworkAccess setAccessCode(Max35Text accessCode) {
		this.accessCode = Objects.requireNonNull(accessCode);
		return this;
	}

	public List<SecurityCertificate> getClientCertificate() {
		return clientCertificate == null ? clientCertificate = new ArrayList<>() : clientCertificate;
	}

	public NetworkAccess setClientCertificate(List<com.tools20022.repository.entity.SecurityCertificate> clientCertificate) {
		this.clientCertificate = Objects.requireNonNull(clientCertificate);
		return this;
	}

	public Optional<TerminalManagementSystem> getTerminalManagementSystem() {
		return terminalManagementSystem == null ? Optional.empty() : Optional.of(terminalManagementSystem);
	}

	public NetworkAccess setTerminalManagementSystem(com.tools20022.repository.entity.TerminalManagementSystem terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
		return this;
	}

	public Max1025Text getNetworkAddress() {
		return networkAddress;
	}

	public NetworkAccess setNetworkAddress(Max1025Text networkAddress) {
		this.networkAddress = Objects.requireNonNull(networkAddress);
		return this;
	}
}