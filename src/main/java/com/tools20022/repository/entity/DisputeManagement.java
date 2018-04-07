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
import com.tools20022.repository.codeset.DisputeResolutionTypeCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.CollateralManagement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Provides the dispute details on the variation margin and/or the segregated
 * independent amount.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DisputeManagement" src="doc-files/DisputeManagement.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#mmDisputedAmount
 * DisputeManagement.mmDisputedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#mmDisputeDate
 * DisputeManagement.mmDisputeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#mmDisputeResolutionType
 * DisputeManagement.mmDisputeResolutionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DisputeManagement#mmRelatedManagementProcess
 * DisputeManagement.mmRelatedManagementProcess}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmDisputeManagement
 * CollateralManagement.mmDisputeManagement}</li>
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
 * "DisputeManagement"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the dispute details on the variation margin and/or the segregated independent amount."
 * </li>
 * </ul>
 */
public class DisputeManagement {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount disputedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Disputed amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<DisputeManagement, CurrencyAndAmount> mmDisputedAmount = new MMBusinessAttribute<DisputeManagement, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisputedAmount";
			definition = "Disputed amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(DisputeManagement obj) {
			return obj.getDisputedAmount();
		}

		@Override
		public void setValue(DisputeManagement obj, CurrencyAndAmount value) {
			obj.setDisputedAmount(value);
		}
	};
	protected ISODate disputeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of dispute."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<DisputeManagement, ISODate> mmDisputeDate = new MMBusinessAttribute<DisputeManagement, ISODate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisputeDate";
			definition = "Date of dispute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(DisputeManagement obj) {
			return obj.getDisputeDate();
		}

		@Override
		public void setValue(DisputeManagement obj, ISODate value) {
			obj.setDisputeDate(value);
		}
	};
	protected DisputeResolutionTypeCode disputeResolutionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DisputeResolutionTypeCode
	 * DisputeResolutionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeResolutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<DisputeManagement, DisputeResolutionTypeCode> mmDisputeResolutionType = new MMBusinessAttribute<DisputeManagement, DisputeResolutionTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DisputeResolutionType";
			definition = "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DisputeResolutionTypeCode.mmObject();
		}

		@Override
		public DisputeResolutionTypeCode getValue(DisputeManagement obj) {
			return obj.getDisputeResolutionType();
		}

		@Override
		public void setValue(DisputeManagement obj, DisputeResolutionTypeCode value) {
			obj.setDisputeResolutionType(value);
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmDisputeManagement
	 * CollateralManagement.mmDisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DisputeManagement
	 * DisputeManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<DisputeManagement, Optional<CollateralManagement>> mmRelatedManagementProcess = new MMBusinessAssociationEnd<DisputeManagement, Optional<CollateralManagement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CollateralManagement.mmDisputeManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}

		@Override
		public Optional<CollateralManagement> getValue(DisputeManagement obj) {
			return obj.getRelatedManagementProcess();
		}

		@Override
		public void setValue(DisputeManagement obj, Optional<CollateralManagement> value) {
			obj.setRelatedManagementProcess(value.orElse(null));
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DisputeManagement";
				definition = "Provides the dispute details on the variation margin and/or the segregated independent amount.";
				associationDomain_lazy = () -> Arrays.asList(CollateralManagement.mmDisputeManagement);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DisputeManagement.mmDisputedAmount, com.tools20022.repository.entity.DisputeManagement.mmDisputeDate,
						com.tools20022.repository.entity.DisputeManagement.mmDisputeResolutionType, com.tools20022.repository.entity.DisputeManagement.mmRelatedManagementProcess);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DisputeManagement.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getDisputedAmount() {
		return disputedAmount;
	}

	public DisputeManagement setDisputedAmount(CurrencyAndAmount disputedAmount) {
		this.disputedAmount = Objects.requireNonNull(disputedAmount);
		return this;
	}

	public ISODate getDisputeDate() {
		return disputeDate;
	}

	public DisputeManagement setDisputeDate(ISODate disputeDate) {
		this.disputeDate = Objects.requireNonNull(disputeDate);
		return this;
	}

	public DisputeResolutionTypeCode getDisputeResolutionType() {
		return disputeResolutionType;
	}

	public DisputeManagement setDisputeResolutionType(DisputeResolutionTypeCode disputeResolutionType) {
		this.disputeResolutionType = Objects.requireNonNull(disputeResolutionType);
		return this;
	}

	public Optional<CollateralManagement> getRelatedManagementProcess() {
		return relatedManagementProcess == null ? Optional.empty() : Optional.of(relatedManagementProcess);
	}

	public DisputeManagement setRelatedManagementProcess(CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
		return this;
	}
}