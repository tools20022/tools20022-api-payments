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
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
	protected ActiveCurrencyAndAmount disputedAmount;
	/**
	 * Disputed amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
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
	 * name} = "DisputedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Disputed amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDisputedAmount = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedAmount";
			definition = "Disputed amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DisputeManagement.class.getMethod("getDisputedAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate disputeDate;
	/**
	 * Date of dispute.
	 * <p>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of dispute."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDisputeDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeDate";
			definition = "Date of dispute.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DisputeManagement.class.getMethod("getDisputeDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DisputeResolutionTypeCode disputeResolutionType;
	/**
	 * Specifies the type of dispute that is to be resolved regarding the
	 * disputed collateral amount.
	 * <p>
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
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputeResolutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDisputeResolutionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputeResolutionType";
			definition = "Specifies the type of dispute that is to be resolved regarding the disputed collateral amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DisputeResolutionTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DisputeManagement.class.getMethod("getDisputeResolutionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * Process which groups the activities related to collateral.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedManagementProcess = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DisputeManagement.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmDisputeManagement;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CollateralManagement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DisputeManagement";
				definition = "Provides the dispute details on the variation margin and/or the segregated independent amount.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralManagement.mmDisputeManagement);
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

	public ActiveCurrencyAndAmount getDisputedAmount() {
		return disputedAmount;
	}

	public void setDisputedAmount(ActiveCurrencyAndAmount disputedAmount) {
		this.disputedAmount = disputedAmount;
	}

	public ISODate getDisputeDate() {
		return disputeDate;
	}

	public void setDisputeDate(ISODate disputeDate) {
		this.disputeDate = disputeDate;
	}

	public DisputeResolutionTypeCode getDisputeResolutionType() {
		return disputeResolutionType;
	}

	public void setDisputeResolutionType(DisputeResolutionTypeCode disputeResolutionType) {
		this.disputeResolutionType = disputeResolutionType;
	}

	public CollateralManagement getRelatedManagementProcess() {
		return relatedManagementProcess;
	}

	public void setRelatedManagementProcess(com.tools20022.repository.entity.CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
	}
}