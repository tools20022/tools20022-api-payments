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
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Specifies the reporting parameters that are included in the account contract
 * which specifies the services linked to the account..
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReportingService" src="doc-files/ReportingService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
 * ReportingService.mmStatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmFloorNotificationAmount
 * ReportingService.mmFloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmCeilingNotificationAmount
 * ReportingService.mmCeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmReportingChannel
 * ReportingService.mmReportingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#mmRelatedInvestmentAccountService
 * ReportingService.mmRelatedInvestmentAccountService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedReportingService
 * ContactPoint.mmRelatedReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReportingService
 * InvestmentAccountService.mmReportingService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndFormModification1#mmStatementFrequencyAndForm
 * StatementFrequencyAndFormModification1.mmStatementFrequencyAndForm}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
 * StatementFrequencyAndForm1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndFormModification1
 * StatementFrequencyAndFormModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest3
 * ReportingRequest3}</li>
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
 * "ReportingService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account.."
 * </li>
 * </ul>
 */
public class ReportingService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected FrequencyCode statementFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmFrequency
	 * StatementFrequencyAndForm1.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmStatementFrequencyAndFormat
	 * CustomerAccount5.mmStatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmStatementFrequencyAndFormat
	 * CustomerAccountModification1.mmStatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmStatementFrequencyAndFormat
	 * CustomerAccount4.mmStatementFrequencyAndFormat}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency at which a statement must be created by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmStatementFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(StatementFrequencyAndForm1.mmFrequency, CustomerAccount5.mmStatementFrequencyAndFormat, CustomerAccountModification1.mmStatementFrequencyAndFormat,
					CustomerAccount4.mmStatementFrequencyAndFormat);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StatementFrequency";
			definition = "Specifies the frequency at which a statement must be created by the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReportingService.class.getMethod("getStatementFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount floorNotificationAmount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmFloorNotificationAmount
	 * CustomerAccount5.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmFloorNotificationAmount
	 * CustomerAccountModification1.mmFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmFloorNotificationAmount
	 * CustomerAccount4.mmFloorNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFloorNotificationAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount5.mmFloorNotificationAmount, CustomerAccountModification1.mmFloorNotificationAmount, CustomerAccount4.mmFloorNotificationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReportingService.class.getMethod("getFloorNotificationAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount ceilingNotificationAmount;
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
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#mmCeilingNotificationAmount
	 * CustomerAccount5.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmCeilingNotificationAmount
	 * CustomerAccountModification1.mmCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#mmCeilingNotificationAmount
	 * CustomerAccount4.mmCeilingNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCeilingNotificationAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CustomerAccount5.mmCeilingNotificationAmount, CustomerAccountModification1.mmCeilingNotificationAmount, CustomerAccount4.mmCeilingNotificationAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ReportingService.class.getMethod("getCeilingNotificationAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ContactPoint> reportingChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#mmRelatedReportingService
	 * ContactPoint.mmRelatedReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#mmCommunicationMethod
	 * StatementFrequencyAndForm1.mmCommunicationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the channel through which the statement must be made available to the account owner or to the information recipient."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReportingChannel = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(StatementFrequencyAndForm1.mmCommunicationMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportingChannel";
			definition = "Specifies the channel through which the statement must be made available to the account owner or to the information recipient.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmRelatedReportingService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ContactPoint.mmObject();
		}
	};
	protected InvestmentAccountService relatedInvestmentAccountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReportingService
	 * InvestmentAccountService.mmReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account services which include reporting services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedInvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ReportingService.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccountService";
			definition = "Investment account services which include reporting services.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmReportingService;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingService";
				definition = "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.mmRelatedReportingService, com.tools20022.repository.entity.InvestmentAccountService.mmReportingService);
				derivationElement_lazy = () -> Arrays.asList(StatementFrequencyAndFormModification1.mmStatementFrequencyAndForm);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.mmStatementFrequency, com.tools20022.repository.entity.ReportingService.mmFloorNotificationAmount,
						com.tools20022.repository.entity.ReportingService.mmCeilingNotificationAmount, com.tools20022.repository.entity.ReportingService.mmReportingChannel,
						com.tools20022.repository.entity.ReportingService.mmRelatedInvestmentAccountService);
				derivationComponent_lazy = () -> Arrays.asList(StatementFrequencyAndForm1.mmObject(), StatementFrequencyAndFormModification1.mmObject(), ReportingRequest3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ReportingService.class;
			}
		});
		return mmObject_lazy.get();
	}

	public FrequencyCode getStatementFrequency() {
		return statementFrequency;
	}

	public ReportingService setStatementFrequency(FrequencyCode statementFrequency) {
		this.statementFrequency = Objects.requireNonNull(statementFrequency);
		return this;
	}

	public CurrencyAndAmount getFloorNotificationAmount() {
		return floorNotificationAmount;
	}

	public ReportingService setFloorNotificationAmount(CurrencyAndAmount floorNotificationAmount) {
		this.floorNotificationAmount = Objects.requireNonNull(floorNotificationAmount);
		return this;
	}

	public CurrencyAndAmount getCeilingNotificationAmount() {
		return ceilingNotificationAmount;
	}

	public ReportingService setCeilingNotificationAmount(CurrencyAndAmount ceilingNotificationAmount) {
		this.ceilingNotificationAmount = Objects.requireNonNull(ceilingNotificationAmount);
		return this;
	}

	public List<ContactPoint> getReportingChannel() {
		return reportingChannel == null ? reportingChannel = new ArrayList<>() : reportingChannel;
	}

	public ReportingService setReportingChannel(List<com.tools20022.repository.entity.ContactPoint> reportingChannel) {
		this.reportingChannel = Objects.requireNonNull(reportingChannel);
		return this;
	}

	public InvestmentAccountService getRelatedInvestmentAccountService() {
		return relatedInvestmentAccountService;
	}

	public ReportingService setRelatedInvestmentAccountService(com.tools20022.repository.entity.InvestmentAccountService relatedInvestmentAccountService) {
		this.relatedInvestmentAccountService = Objects.requireNonNull(relatedInvestmentAccountService);
		return this;
	}
}