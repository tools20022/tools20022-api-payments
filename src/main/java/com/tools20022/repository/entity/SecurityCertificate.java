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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Document;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#ElectronicSignature
 * SecurityCertificate.ElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#SecurityCertificatePartyRole
 * SecurityCertificate.SecurityCertificatePartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#NetworkAccess
 * SecurityCertificate.NetworkAccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#CertificateType
 * SecurityCertificate.CertificateType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#RelatedSecurityCertificate
 * ElectronicSignature.RelatedSecurityCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole#SecurityCertificate
 * SecurityCertificatePartyRole.SecurityCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetworkAccess#ClientCertificate
 * NetworkAccess.ClientCertificate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
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
	/**
	 * Additional security provisions, such as a digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#RelatedSecurityCertificate
	 * ElectronicSignature.RelatedSecurityCertificate}</li>
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
	 * {@linkplain com.tools20022.repository.msg.DocumentGeneralInformation3#LinkFileHash
	 * DocumentGeneralInformation3.LinkFileHash}</li>
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
	public static final MMBusinessAssociationEnd ElectronicSignature = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DocumentGeneralInformation3.LinkFileHash);
			elementContext_lazy = () -> SecurityCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicSignature";
			definition = "Additional security provisions, such as a digital signature.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicSignature.RelatedSecurityCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Role played by a party in the context of a security certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificatePartyRole#SecurityCertificate
	 * SecurityCertificatePartyRole.SecurityCertificate}</li>
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
	public static final MMBusinessAssociationEnd SecurityCertificatePartyRole = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecurityCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecurityCertificatePartyRole";
			definition = "Role played by a party in the context of a security certificate.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.SecurityCertificatePartyRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificatePartyRole.SecurityCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Network access which uses a security certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetworkAccess#ClientCertificate
	 * NetworkAccess.ClientCertificate}</li>
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
	public static final MMBusinessAssociationEnd NetworkAccess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecurityCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NetworkAccess";
			definition = "Network access which uses a security certificate.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.NetworkAccess.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.NetworkAccess.ClientCertificate;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Type of the security certificate.
	 * <p>
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
	public static final MMBusinessAttribute CertificateType = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecurityCertificate.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CertificateType";
			definition = "Type of the security certificate.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecurityCertificate";
				definition = "Certificate linked to a digital signature.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicSignature.RelatedSecurityCertificate, com.tools20022.repository.entity.SecurityCertificatePartyRole.SecurityCertificate,
						com.tools20022.repository.entity.NetworkAccess.ClientCertificate);
				superType_lazy = () -> Document.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecurityCertificate.ElectronicSignature, com.tools20022.repository.entity.SecurityCertificate.SecurityCertificatePartyRole,
						com.tools20022.repository.entity.SecurityCertificate.NetworkAccess, com.tools20022.repository.entity.SecurityCertificate.CertificateType);
			}
		});
		return mmObject_lazy.get();
	}
}