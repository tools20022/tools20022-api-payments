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
import com.tools20022.repository.datatype.ExtensiveBranchNetworkIdentifier;
import com.tools20022.repository.datatype.SmallNetworkIdentifier;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmExtensiveBranchNetworkIdentification
 * AustralianBSBIdentification.mmExtensiveBranchNetworkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmSmallNetworkIdentification
 * AustralianBSBIdentification.mmSmallNetworkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmClearingSystemMemberIdentificationType
 * AustralianBSBIdentification.mmClearingSystemMemberIdentificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AustralianBSBIdentification#mmClearingSystemMember
 * AustralianBSBIdentification.mmClearingSystemMember}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmAustralianBSBCode
 * CashClearingSystemMember.mmAustralianBSBCode}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected ExtensiveBranchNetworkIdentifier extensiveBranchNetworkIdentification;
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
	public static final MMBusinessAttribute mmExtensiveBranchNetworkIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExtensiveBranchNetworkIdentification";
			definition = "Extensive branch network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions, as assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExtensiveBranchNetworkIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AustralianBSBIdentification.class.getMethod("getExtensiveBranchNetworkIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SmallNetworkIdentifier smallNetworkIdentification;
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
	public static final MMBusinessAttribute mmSmallNetworkIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SmallNetworkIdentification";
			definition = "Small network list of the Australian Bank State Branch (BSB) Code. The codes are used for identifying Australian financial institutions , as assigned by the Australian Payments Clearing Association (APCA).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SmallNetworkIdentifier.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AustralianBSBIdentification.class.getMethod("getSmallNetworkIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CashClearingSystemMember clearingSystemMemberIdentificationType;
	/**
	 * Clearing system member identification for which an Australian BSB
	 * identification is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashClearingSystemMember#mmAustralianBSBCode
	 * CashClearingSystemMember.mmAustralianBSBCode}</li>
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
	public static final MMBusinessAssociationEnd mmClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Clearing system member identification for which an Australian BSB identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmAustralianBSBCode;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
		}
	};
	protected CashClearingSystemMember clearingSystemMember;
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
	public static final MMBusinessAttribute mmClearingSystemMember = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMember";
			definition = "Clearing system for which an Australian code is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.entity.CashClearingSystemMember.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AustralianBSBIdentification.class.getMethod("getClearingSystemMember", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AustralianBSBIdentification";
				definition = "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA).";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashClearingSystemMember.mmAustralianBSBCode);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AustralianBSBIdentification.mmExtensiveBranchNetworkIdentification,
						com.tools20022.repository.entity.AustralianBSBIdentification.mmSmallNetworkIdentification, com.tools20022.repository.entity.AustralianBSBIdentification.mmClearingSystemMemberIdentificationType,
						com.tools20022.repository.entity.AustralianBSBIdentification.mmClearingSystemMember);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AustralianBSBIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ExtensiveBranchNetworkIdentifier getExtensiveBranchNetworkIdentification() {
		return extensiveBranchNetworkIdentification;
	}

	public void setExtensiveBranchNetworkIdentification(ExtensiveBranchNetworkIdentifier extensiveBranchNetworkIdentification) {
		this.extensiveBranchNetworkIdentification = extensiveBranchNetworkIdentification;
	}

	public SmallNetworkIdentifier getSmallNetworkIdentification() {
		return smallNetworkIdentification;
	}

	public void setSmallNetworkIdentification(SmallNetworkIdentifier smallNetworkIdentification) {
		this.smallNetworkIdentification = smallNetworkIdentification;
	}

	public CashClearingSystemMember getClearingSystemMemberIdentificationType() {
		return clearingSystemMemberIdentificationType;
	}

	public void setClearingSystemMemberIdentificationType(com.tools20022.repository.entity.CashClearingSystemMember clearingSystemMemberIdentificationType) {
		this.clearingSystemMemberIdentificationType = clearingSystemMemberIdentificationType;
	}

	public CashClearingSystemMember getClearingSystemMember() {
		return clearingSystemMember;
	}

	public void setClearingSystemMember(com.tools20022.repository.entity.CashClearingSystemMember clearingSystemMember) {
		this.clearingSystemMember = clearingSystemMember;
	}
}