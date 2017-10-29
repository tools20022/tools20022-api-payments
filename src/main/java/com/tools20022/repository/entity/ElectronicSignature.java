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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Signature;
import com.tools20022.repository.msg.PartyAndSignature2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Additional security provisions, such as a digital signature.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ElectronicSignature" src="doc-files/ElectronicSignature.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#Undertaking
 * ElectronicSignature.Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicSignature#RelatedSecurityCertificate
 * ElectronicSignature.RelatedSecurityCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Undertaking#ElectronicSignature
 * Undertaking.ElectronicSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#ElectronicSignature
 * SecurityCertificate.ElectronicSignature}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2#Signature
 * PartyAndSignature2.Signature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateRelatedInformation11#ElectronicSignature
 * MandateRelatedInformation11.ElectronicSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Signature
 * Signature}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PartyAndSignature2
 * PartyAndSignature2}</li>
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
 * "ElectronicSignature"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional security provisions, such as a digital signature."</li>
 * </ul>
 */
public class ElectronicSignature extends Signature {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Undertaking for which a signature is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#ElectronicSignature
	 * Undertaking.ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Undertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Undertaking for which a signature is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Undertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ElectronicSignature.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Undertaking";
			definition = "Undertaking for which a signature is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Undertaking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.ElectronicSignature;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Certificate linked to a digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecurityCertificate#ElectronicSignature
	 * SecurityCertificate.ElectronicSignature}</li>
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
	 * {@linkplain com.tools20022.repository.entity.ElectronicSignature
	 * ElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecurityCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate linked to a digital signature."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecurityCertificate = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ElectronicSignature.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecurityCertificate";
			definition = "Certificate linked to a digital signature.";
			minOccurs = 0;
			type_lazy = () -> SecurityCertificate.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecurityCertificate.ElectronicSignature;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ElectronicSignature";
				definition = "Additional security provisions, such as a digital signature.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Undertaking.ElectronicSignature, com.tools20022.repository.entity.SecurityCertificate.ElectronicSignature);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAndSignature2.Signature, com.tools20022.repository.msg.MandateRelatedInformation11.ElectronicSignature);
				superType_lazy = () -> Signature.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicSignature.Undertaking, com.tools20022.repository.entity.ElectronicSignature.RelatedSecurityCertificate);
				derivationComponent_lazy = () -> Arrays.asList(PartyAndSignature2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}