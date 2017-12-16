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
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CreditInstrument;
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Movement of cash between two accounts. One account is debited and the other
 * account is credited.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="BookEntry" src="doc-files/BookEntry.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.CreditInstrument
 * CreditInstrument}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmCashEntry
 * BookEntry.mmCashEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmDebitEntry
 * BookEntry.mmDebitEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmCreditEntry
 * BookEntry.mmCreditEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BookEntry#mmTransferAdvice
 * BookEntry.mmTransferAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundSubscriptionCashInFlow
 * BookEntry.mmFundSubscriptionCashInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmFundRedemptionCashOutFlow
 * BookEntry.mmFundRedemptionCashOutFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BookEntry#mmRelatedSettlementInstruction
 * BookEntry.mmRelatedSettlementInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedBookEntry
 * CashEntry.mmRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmDebitRelatedBookEntry
 * CashEntry.mmDebitRelatedBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCreditRelatedBookEntry
 * CashEntry.mmCreditRelatedBookEntry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashSettlement#mmBookEntry
 * CashSettlement.mmBookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundSubscriptionAccountEntry
 * FundsCashFlow.mmFundSubscriptionAccountEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundRedemptionAccountEntry
 * FundsCashFlow.mmFundRedemptionAccountEntry}</li>
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
 * "BookEntry"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Movement of cash between two accounts. One account is debited and the other account is credited."
 * </li>
 * </ul>
 */
public class BookEntry extends CreditInstrument {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashEntry> cashEntry;
	/**
	 * Specifies the amount transferred on the account. An account entry may
	 * result in several cash entries for instance net amount (credited) and
	 * charges (debited).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmRelatedBookEntry
	 * CashEntry.mmRelatedBookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amount transferred on the account. An account entry may result in several cash entries for instance net amount (credited) and charges (debited)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashEntry";
			definition = "Specifies the amount transferred on the account. An account entry may result in several cash entries for instance net amount (credited) and charges (debited).";
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmRelatedBookEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> debitEntry;
	/**
	 * Specifies the debit entry resuling from a settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmDebitRelatedBookEntry
	 * CashEntry.mmDebitRelatedBookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the debit entry resuling from a settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDebitEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DebitEntry";
			definition = "Specifies the debit entry resuling from a settlement instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmDebitRelatedBookEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.CashEntry> creditEntry;
	/**
	 * Specifies the credit entry resuling from a settlement instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCreditRelatedBookEntry
	 * CashEntry.mmCreditRelatedBookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the credit entry resuling from a settlement instruction."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCreditEntry = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditEntry";
			definition = "Specifies the credit entry resuling from a settlement instruction.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.mmCreditRelatedBookEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashEntry.mmObject();
		}
	};
	protected YesNoIndicator transferAdvice;
	/**
	 * Indicates that when an amount of money has been transferred in the books
	 * of the account servicer, an advice should be sent back to the account
	 * owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that when an amount of money has been transferred in the books of the account servicer, an advice should be sent back to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTransferAdvice = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TransferAdvice";
			definition = "Indicates that when an amount of money has been transferred in the books of the account servicer, an advice should be sent back to the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BookEntry.class.getMethod("getTransferAdvice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FundsCashFlow fundSubscriptionCashInFlow;
	/**
	 * Amount of money received from investors as a result of a subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundSubscriptionAccountEntry
	 * FundsCashFlow.mmFundSubscriptionAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundSubscriptionCashInFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money received from investors as a result of a subscription."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundSubscriptionCashInFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundSubscriptionCashInFlow";
			definition = "Amount of money received from investors as a result of a subscription.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmFundSubscriptionAccountEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
		}
	};
	protected FundsCashFlow fundRedemptionCashOutFlow;
	/**
	 * Amount of money paid to investors as a result of a redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmFundRedemptionAccountEntry
	 * FundsCashFlow.mmFundRedemptionAccountEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundRedemptionCashOutFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money paid to investors as a result of a redemption."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundRedemptionCashOutFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundRedemptionCashOutFlow";
			definition = "Amount of money paid to investors as a result of a redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmFundRedemptionAccountEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
		}
	};
	protected CashSettlement relatedSettlementInstruction;
	/**
	 * Related settlement instruction wich is the source of the book entry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmBookEntry
	 * CashSettlement.mmBookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashSettlement
	 * CashSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.BookEntry
	 * BookEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related settlement instruction wich is the source of the book entry."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSettlementInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.BookEntry.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedSettlementInstruction";
			definition = "Related settlement instruction wich is the source of the book entry.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmBookEntry;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BookEntry";
				definition = "Movement of cash between two accounts. One account is debited and the other account is credited.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashEntry.mmRelatedBookEntry, com.tools20022.repository.entity.CashEntry.mmDebitRelatedBookEntry,
						com.tools20022.repository.entity.CashEntry.mmCreditRelatedBookEntry, com.tools20022.repository.entity.CashSettlement.mmBookEntry, com.tools20022.repository.entity.FundsCashFlow.mmFundSubscriptionAccountEntry,
						com.tools20022.repository.entity.FundsCashFlow.mmFundRedemptionAccountEntry);
				superType_lazy = () -> CreditInstrument.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.BookEntry.mmCashEntry, com.tools20022.repository.entity.BookEntry.mmDebitEntry, com.tools20022.repository.entity.BookEntry.mmCreditEntry,
						com.tools20022.repository.entity.BookEntry.mmTransferAdvice, com.tools20022.repository.entity.BookEntry.mmFundSubscriptionCashInFlow, com.tools20022.repository.entity.BookEntry.mmFundRedemptionCashOutFlow,
						com.tools20022.repository.entity.BookEntry.mmRelatedSettlementInstruction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return BookEntry.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashEntry> getCashEntry() {
		return cashEntry;
	}

	public void setCashEntry(List<com.tools20022.repository.entity.CashEntry> cashEntry) {
		this.cashEntry = cashEntry;
	}

	public List<CashEntry> getDebitEntry() {
		return debitEntry;
	}

	public void setDebitEntry(List<com.tools20022.repository.entity.CashEntry> debitEntry) {
		this.debitEntry = debitEntry;
	}

	public List<CashEntry> getCreditEntry() {
		return creditEntry;
	}

	public void setCreditEntry(List<com.tools20022.repository.entity.CashEntry> creditEntry) {
		this.creditEntry = creditEntry;
	}

	public YesNoIndicator getTransferAdvice() {
		return transferAdvice;
	}

	public void setTransferAdvice(YesNoIndicator transferAdvice) {
		this.transferAdvice = transferAdvice;
	}

	public FundsCashFlow getFundSubscriptionCashInFlow() {
		return fundSubscriptionCashInFlow;
	}

	public void setFundSubscriptionCashInFlow(com.tools20022.repository.entity.FundsCashFlow fundSubscriptionCashInFlow) {
		this.fundSubscriptionCashInFlow = fundSubscriptionCashInFlow;
	}

	public FundsCashFlow getFundRedemptionCashOutFlow() {
		return fundRedemptionCashOutFlow;
	}

	public void setFundRedemptionCashOutFlow(com.tools20022.repository.entity.FundsCashFlow fundRedemptionCashOutFlow) {
		this.fundRedemptionCashOutFlow = fundRedemptionCashOutFlow;
	}

	public CashSettlement getRelatedSettlementInstruction() {
		return relatedSettlementInstruction;
	}

	public void setRelatedSettlementInstruction(com.tools20022.repository.entity.CashSettlement relatedSettlementInstruction) {
		this.relatedSettlementInstruction = relatedSettlementInstruction;
	}
}