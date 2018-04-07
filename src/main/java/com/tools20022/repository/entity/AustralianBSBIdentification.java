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
import com.tools20022.repository.entity.CashClearingSystemMember;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
	protected ExtensiveBranchNetworkIdentifier extensiveBranchNetworkIdentification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AustralianBSBIdentification, ExtensiveBranchNetworkIdentifier> mmExtensiveBranchNetworkIdentification = new MMBusinessAttribute<AustralianBSBIdentification, ExtensiveBranchNetworkIdentifier>() {
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

		@Override
		public ExtensiveBranchNetworkIdentifier getValue(AustralianBSBIdentification obj) {
			return obj.getExtensiveBranchNetworkIdentification();
		}

		@Override
		public void setValue(AustralianBSBIdentification obj, ExtensiveBranchNetworkIdentifier value) {
			obj.setExtensiveBranchNetworkIdentification(value);
		}
	};
	protected SmallNetworkIdentifier smallNetworkIdentification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AustralianBSBIdentification, SmallNetworkIdentifier> mmSmallNetworkIdentification = new MMBusinessAttribute<AustralianBSBIdentification, SmallNetworkIdentifier>() {
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

		@Override
		public SmallNetworkIdentifier getValue(AustralianBSBIdentification obj) {
			return obj.getSmallNetworkIdentification();
		}

		@Override
		public void setValue(AustralianBSBIdentification obj, SmallNetworkIdentifier value) {
			obj.setSmallNetworkIdentification(value);
		}
	};
	protected CashClearingSystemMember clearingSystemMemberIdentificationType;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAssociationEnd<AustralianBSBIdentification, CashClearingSystemMember> mmClearingSystemMemberIdentificationType = new MMBusinessAssociationEnd<AustralianBSBIdentification, CashClearingSystemMember>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMemberIdentificationType";
			definition = "Clearing system member identification for which an Australian BSB identification is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashClearingSystemMember.mmAustralianBSBCode;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashClearingSystemMember.mmObject();
		}

		@Override
		public CashClearingSystemMember getValue(AustralianBSBIdentification obj) {
			return obj.getClearingSystemMemberIdentificationType();
		}

		@Override
		public void setValue(AustralianBSBIdentification obj, CashClearingSystemMember value) {
			obj.setClearingSystemMemberIdentificationType(value);
		}
	};
	protected CashClearingSystemMember clearingSystemMember;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AustralianBSBIdentification, Optional<CashClearingSystemMember>> mmClearingSystemMember = new MMBusinessAttribute<AustralianBSBIdentification, Optional<CashClearingSystemMember>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AustralianBSBIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingSystemMember";
			definition = "Clearing system for which an Australian code is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashClearingSystemMember.mmObject();
		}

		@Override
		public Optional<CashClearingSystemMember> getValue(AustralianBSBIdentification obj) {
			return obj.getClearingSystemMember();
		}

		@Override
		public void setValue(AustralianBSBIdentification obj, Optional<CashClearingSystemMember> value) {
			obj.setClearingSystemMember(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AustralianBSBIdentification";
				definition = "Australian Bank State Branch (BSB) Code - identifies Australian financial institutions on the Australian national clearing system. The code is assigned by the Australian Payments Clearing Association (APCA).";
				associationDomain_lazy = () -> Arrays.asList(CashClearingSystemMember.mmAustralianBSBCode);
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

	public AustralianBSBIdentification setExtensiveBranchNetworkIdentification(ExtensiveBranchNetworkIdentifier extensiveBranchNetworkIdentification) {
		this.extensiveBranchNetworkIdentification = Objects.requireNonNull(extensiveBranchNetworkIdentification);
		return this;
	}

	public SmallNetworkIdentifier getSmallNetworkIdentification() {
		return smallNetworkIdentification;
	}

	public AustralianBSBIdentification setSmallNetworkIdentification(SmallNetworkIdentifier smallNetworkIdentification) {
		this.smallNetworkIdentification = Objects.requireNonNull(smallNetworkIdentification);
		return this;
	}

	public CashClearingSystemMember getClearingSystemMemberIdentificationType() {
		return clearingSystemMemberIdentificationType;
	}

	public AustralianBSBIdentification setClearingSystemMemberIdentificationType(CashClearingSystemMember clearingSystemMemberIdentificationType) {
		this.clearingSystemMemberIdentificationType = Objects.requireNonNull(clearingSystemMemberIdentificationType);
		return this;
	}

	public Optional<CashClearingSystemMember> getClearingSystemMember() {
		return clearingSystemMember == null ? Optional.empty() : Optional.of(clearingSystemMember);
	}

	public AustralianBSBIdentification setClearingSystemMember(CashClearingSystemMember clearingSystemMember) {
		this.clearingSystemMember = clearingSystemMember;
		return this;
	}
}