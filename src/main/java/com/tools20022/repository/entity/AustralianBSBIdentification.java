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
import com.tools20022.repository.datatype.ExtensiveBranchNetworkIdentifier;
import com.tools20022.repository.datatype.SmallNetworkIdentifier;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Australian Bank State Branch (BSB) Code - identifies Australian financial
 * institutions on the Australian national clearing system. The code is assigned
 * by the Australian Payments Clearing Association (APCA).
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AustralianBSBIdentification"
 * src="doc-files/AustralianBSBIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#ExtensiveBranchNetworkIdentification
 * AustralianBSBIdentification.ExtensiveBranchNetworkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#SmallNetworkIdentification
 * AustralianBSBIdentification.SmallNetworkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#ClearingSystemMemberIdentificationType
 * AustralianBSBIdentification.ClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#ClearingSystemMember
 * AustralianBSBIdentification.ClearingSystemMember}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#AustralianBSBCode
 * CashClearingSystemMember.AustralianBSBCode}</li>
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
 * "AustralianBSBIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA)."
 * </li>
 * </ul>
 */
public class AustralianBSBIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Extensive branch network list of the Australian Bank State Branch (BSB)
	 * Code. The codes are used for identifying Australian financial
	 * institutions, as assigned by the Australian Payments Clearing Association
	 * (APCA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ExtensiveBranchNetworkIdentifier
	 * ExtensiveBranchNetworkIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification
	 * AustralianBSBIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtensiveBranchNetworkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExtensiveBranchNetworkIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AustralianBSBIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExtensiveBranchNetworkIdentification";
			definition = "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExtensiveBranchNetworkIdentifier.mmObject();
		}
	};
	/**
	 * Small network list of the Australian Bank State Branch (BSB) Code. The
	 * codes are used for identifying Australian financial institutions , as
	 * assigned by the Australian Payments Clearing Association (APCA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.SmallNetworkIdentifier
	 * SmallNetworkIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification
	 * AustralianBSBIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallNetworkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions , as assigned by the Australian Payments Clearing Association (APCA)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SmallNetworkIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AustralianBSBIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SmallNetworkIdentification";
			definition = "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions , as assigned by the Australian Payments Clearing Association (APCA).";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SmallNetworkIdentifier.mmObject();
		}
	};
	/**
	 * Clearing system member identification for which an Australian BSB
	 * identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#AustralianBSBCode
	 * CashClearingSystemMember.AustralianBSBCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification
	 * AustralianBSBIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMemberIdentificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing system member identification for which an Australian BSB identification is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AustralianBSBIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Clearing system member identification for which an Australian BSB identification is provided.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashClearingSystemMember.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.AustralianBSBCode;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Clearing system for which an Australian code is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember
	 * CashClearingSystemMember}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification
	 * AustralianBSBIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSystemMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Clearing system for which an Australian code is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ClearingSystemMember = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AustralianBSBIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMember";
			definition = "Clearing system for which an Australian code is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> CashClearingSystemMember.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AustralianBSBIdentification";
				definition = "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystemMember.AustralianBSBCode);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AustralianBSBIdentification.ExtensiveBranchNetworkIdentification, com.tools20022.repository.entity.AustralianBSBIdentification.SmallNetworkIdentification,
						com.tools20022.repository.entity.AustralianBSBIdentification.ClearingSystemMemberIdentificationType, com.tools20022.repository.entity.AustralianBSBIdentification.ClearingSystemMember);
			}
		});
		return mmObject_lazy.get();
	}
}