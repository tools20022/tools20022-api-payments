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
import com.tools20022.repository.codeset.ElectionMovementTypeCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Decision taken by the account holder regarding the corporate action event.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CorporateActionElection"
 * src="doc-files/CorporateActionElection.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmExecutionRequestedDateTime
 * CorporateActionElection.mmExecutionRequestedDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmOption
 * CorporateActionElection.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmCashAccount
 * CorporateActionElection.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmElectionType
 * CorporateActionElection.mmElectionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmQuantity
 * CorporateActionElection.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmAmendmentReason
 * CorporateActionElection.mmAmendmentReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionElection#mmRelatedServicing
 * CorporateActionElection.mmRelatedServicing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCorporateActionElection
 * CashAccount.mmRelatedCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionElection
 * SecuritiesQuantity.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionElection
 * CorporateActionOption.mmCorporateActionElection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionElection
 * CorporateActionServicing.mmCorporateActionElection}</li>
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
 * "CorporateActionElection"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Decision taken by the account holder regarding the corporate action event."</li>
 * </ul>
 */
public class CorporateActionElection {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime executionRequestedDateTime;
	/**
	 * Date/time at which the instructing party requests the instruction to be
	 * executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionRequestedDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which the instructing party requests the instruction to be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmExecutionRequestedDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExecutionRequestedDateTime";
			definition = "Date/time at which the instructing party requests the instruction to be executed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionElection.class.getMethod("getExecutionRequestedDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.CorporateActionOption> option;
	/**
	 * Option on which the investor makes its decision.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmCorporateActionElection
	 * CorporateActionOption.mmCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option on which the investor makes its decision."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option on which the investor makes its decision.";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionElection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * Specifies the account(s) used in relation with the election of an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmRelatedCorporateActionElection
	 * CashAccount.mmRelatedCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account(s) used in relation with the election of an option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Specifies the account(s) used in relation with the election of an option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmRelatedCorporateActionElection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}
	};
	protected ElectionMovementTypeCode electionType;
	/**
	 * Specifies whether the election results in a change of balance type that
	 * transfers control of the underlying securities or the transfer of
	 * underlying securities themselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ElectionMovementTypeCode
	 * ElectionMovementTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the election results in a change of balance type that transfers control of the underlying securities or the transfer of underlying securities themselves."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmElectionType = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ElectionType";
			definition = "Specifies whether the election results in a change of balance type that transfers control of the underlying securities or the transfer of underlying securities themselves.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ElectionMovementTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionElection.class.getMethod("getElectionType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> quantity;
	/**
	 * Specifies the quantity of securities elected for the associated option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmCorporateActionElection
	 * SecuritiesQuantity.mmCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the quantity of securities elected for the associated option."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmQuantity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Quantity";
			definition = "Specifies the quantity of securities elected for the associated option.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionElection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected Max350Text amendmentReason;
	/**
	 * Reason explaining the amendment of the election.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason explaining the amendment of the election."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAmendmentReason = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmendmentReason";
			definition = "Reason explaining the amendment of the election.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CorporateActionElection.class.getMethod("getAmendmentReason", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionServicing relatedServicing;
	/**
	 * Process which groups the activities related to corporate action
	 * servicing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmCorporateActionElection
	 * CorporateActionServicing.mmCorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing
	 * CorporateActionServicing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionElection
	 * CorporateActionElection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedServicing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to corporate action servicing."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedServicing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CorporateActionElection.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedServicing";
			definition = "Process which groups the activities related to corporate action servicing.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionElection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionServicing.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionElection";
				definition = "Decision taken by the account holder regarding the corporate action event.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmRelatedCorporateActionElection, com.tools20022.repository.entity.SecuritiesQuantity.mmCorporateActionElection,
						com.tools20022.repository.entity.CorporateActionOption.mmCorporateActionElection, com.tools20022.repository.entity.CorporateActionServicing.mmCorporateActionElection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionElection.mmExecutionRequestedDateTime, com.tools20022.repository.entity.CorporateActionElection.mmOption,
						com.tools20022.repository.entity.CorporateActionElection.mmCashAccount, com.tools20022.repository.entity.CorporateActionElection.mmElectionType, com.tools20022.repository.entity.CorporateActionElection.mmQuantity,
						com.tools20022.repository.entity.CorporateActionElection.mmAmendmentReason, com.tools20022.repository.entity.CorporateActionElection.mmRelatedServicing);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CorporateActionElection.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getExecutionRequestedDateTime() {
		return executionRequestedDateTime;
	}

	public void setExecutionRequestedDateTime(ISODateTime executionRequestedDateTime) {
		this.executionRequestedDateTime = executionRequestedDateTime;
	}

	public List<CorporateActionOption> getOption() {
		return option;
	}

	public void setOption(List<com.tools20022.repository.entity.CorporateActionOption> option) {
		this.option = option;
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public ElectionMovementTypeCode getElectionType() {
		return electionType;
	}

	public void setElectionType(ElectionMovementTypeCode electionType) {
		this.electionType = electionType;
	}

	public List<SecuritiesQuantity> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> quantity) {
		this.quantity = quantity;
	}

	public Max350Text getAmendmentReason() {
		return amendmentReason;
	}

	public void setAmendmentReason(Max350Text amendmentReason) {
		this.amendmentReason = amendmentReason;
	}

	public CorporateActionServicing getRelatedServicing() {
		return relatedServicing;
	}

	public void setRelatedServicing(com.tools20022.repository.entity.CorporateActionServicing relatedServicing) {
		this.relatedServicing = relatedServicing;
	}
}