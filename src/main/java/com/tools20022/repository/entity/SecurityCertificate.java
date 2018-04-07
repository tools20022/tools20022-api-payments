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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import com.tools20022.repository.entity.ElectronicSignature;
import com.tools20022.repository.entity.NetworkAccess;
import com.tools20022.repository.entity.SecurityCertificatePartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DocumentGeneralInformation3;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Certificate linked to a digital signature.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecurityCertificate" src="doc-files/SecurityCertificate.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmElectronicSignature
 * SecurityCertificate.mmElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmSecurityCertificatePartyRole
 * SecurityCertificate.mmSecurityCertificatePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmNetworkAccess
 * SecurityCertificate.mmNetworkAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#mmCertificateType
 * SecurityCertificate.mmCertificateType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#mmRelatedSecurityCertificate
 * ElectronicSignature.mmRelatedSecurityCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole#mmSecurityCertificate
 * SecurityCertificatePartyRole.mmSecurityCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmClientCertificate
 * NetworkAccess.mmClientCertificate}</li>
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
 * "SecurityCertificate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Certificate linked to a digital signature."</li>
 * </ul>
 */
public class SecurityCertificate extends Document {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ElectronicSignature electronicSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#mmRelatedSecurityCertificate
	 * ElectronicSignature.mmRelatedSecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#mmLinkFileHash
	 * DocumentGeneralInformation3.mmLinkFileHash}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate
	 * SecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional security provisions, such as a digital signature."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecurityCertificate, Optional<ElectronicSignature>> mmElectronicSignature = new MMBusinessAssociationEnd<SecurityCertificate, Optional<ElectronicSignature>>() {
		{
			derivation_lazy = () -> Arrays.asList(DocumentGeneralInformation3.mmLinkFileHash);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectronicSignature";
			definition = "Additional security provisions, such as a digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmRelatedSecurityCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmObject();
		}

		@Override
		public Optional<ElectronicSignature> getValue(SecurityCertificate obj) {
			return obj.getElectronicSignature();
		}

		@Override
		public void setValue(SecurityCertificate obj, Optional<ElectronicSignature> value) {
			obj.setElectronicSignature(value.orElse(null));
		}
	};
	protected List<com.tools20022.repository.entity.SecurityCertificatePartyRole> securityCertificatePartyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole#mmSecurityCertificate
	 * SecurityCertificatePartyRole.mmSecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole
	 * SecurityCertificatePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate
	 * SecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityCertificatePartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Role played by a party in the context of a security certificate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecurityCertificate, List<SecurityCertificatePartyRole>> mmSecurityCertificatePartyRole = new MMBusinessAssociationEnd<SecurityCertificate, List<SecurityCertificatePartyRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecurityCertificatePartyRole";
			definition = "Role played by a party in the context of a security certificate.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificatePartyRole.mmSecurityCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecurityCertificatePartyRole.mmObject();
		}

		@Override
		public List<SecurityCertificatePartyRole> getValue(SecurityCertificate obj) {
			return obj.getSecurityCertificatePartyRole();
		}

		@Override
		public void setValue(SecurityCertificate obj, List<SecurityCertificatePartyRole> value) {
			obj.setSecurityCertificatePartyRole(value);
		}
	};
	protected NetworkAccess networkAccess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#mmClientCertificate
	 * NetworkAccess.mmClientCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.NetworkAccess
	 * NetworkAccess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate
	 * SecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkAccess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Network access which uses a security certificate."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecurityCertificate, Optional<NetworkAccess>> mmNetworkAccess = new MMBusinessAssociationEnd<SecurityCertificate, Optional<NetworkAccess>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetworkAccess";
			definition = "Network access which uses a security certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmClientCertificate;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
		}

		@Override
		public Optional<NetworkAccess> getValue(SecurityCertificate obj) {
			return obj.getNetworkAccess();
		}

		@Override
		public void setValue(SecurityCertificate obj, Optional<NetworkAccess> value) {
			obj.setNetworkAccess(value.orElse(null));
		}
	};
	protected Max35Text certificateType;
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
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate
	 * SecurityCertificate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of the security certificate."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<SecurityCertificate, Max35Text> mmCertificateType = new MMBusinessAttribute<SecurityCertificate, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Type of the security certificate.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(SecurityCertificate obj) {
			return obj.getCertificateType();
		}

		@Override
		public void setValue(SecurityCertificate obj, Max35Text value) {
			obj.setCertificateType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityCertificate";
				definition = "Certificate linked to a digital signature.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicSignature.mmRelatedSecurityCertificate, com.tools20022.repository.entity.SecurityCertificatePartyRole.mmSecurityCertificate,
						com.tools20022.repository.entity.NetworkAccess.mmClientCertificate);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecurityCertificate.mmElectronicSignature, com.tools20022.repository.entity.SecurityCertificate.mmSecurityCertificatePartyRole,
						com.tools20022.repository.entity.SecurityCertificate.mmNetworkAccess, com.tools20022.repository.entity.SecurityCertificate.mmCertificateType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecurityCertificate.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ElectronicSignature> getElectronicSignature() {
		return electronicSignature == null ? Optional.empty() : Optional.of(electronicSignature);
	}

	public SecurityCertificate setElectronicSignature(com.tools20022.repository.entity.ElectronicSignature electronicSignature) {
		this.electronicSignature = electronicSignature;
		return this;
	}

	public List<SecurityCertificatePartyRole> getSecurityCertificatePartyRole() {
		return securityCertificatePartyRole == null ? securityCertificatePartyRole = new ArrayList<>() : securityCertificatePartyRole;
	}

	public SecurityCertificate setSecurityCertificatePartyRole(List<com.tools20022.repository.entity.SecurityCertificatePartyRole> securityCertificatePartyRole) {
		this.securityCertificatePartyRole = Objects.requireNonNull(securityCertificatePartyRole);
		return this;
	}

	public Optional<NetworkAccess> getNetworkAccess() {
		return networkAccess == null ? Optional.empty() : Optional.of(networkAccess);
	}

	public SecurityCertificate setNetworkAccess(com.tools20022.repository.entity.NetworkAccess networkAccess) {
		this.networkAccess = networkAccess;
		return this;
	}

	public Max35Text getCertificateType() {
		return certificateType;
	}

	public SecurityCertificate setCertificateType(Max35Text certificateType) {
		this.certificateType = Objects.requireNonNull(certificateType);
		return this;
	}
}