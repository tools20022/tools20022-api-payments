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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Process which includes the order, the execution, the settlement of trades in
 * the financial domain.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="FinancialTransaction" src="doc-files/FinancialTransaction.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#CorporateActionDistribution
 * FinancialTransaction.CorporateActionDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#InterestManagement
 * FinancialTransaction.InterestManagement}</li>
 * <li>{@linkplain com.tools20022.repository.entity.FinancialTransaction#Trade
 * FinancialTransaction.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#CollateralMovement
 * FinancialTransaction.CollateralMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#BankingTransaction
 * FinancialTransaction.BankingTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FinancialTransaction#RegulatoryReport
 * FinancialTransaction.RegulatoryReport}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#FinancialTransaction
 * Trade.FinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#FinancialTransaction
 * CorporateActionDistribution.FinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#ReportedTransaction
 * RegulatoryReport.ReportedTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralMovement#FinancialTransaction
 * CollateralMovement.FinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BankingTransaction#FinancialTransaction
 * BankingTransaction.FinancialTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InterestManagement#FinancialTransaction
 * InterestManagement.FinancialTransaction}</li>
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
 * "FinancialTransaction"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Process which includes the order, the execution, the settlement of trades in the financial domain."
 * </li>
 * </ul>
 */
public class FinancialTransaction {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Distribution of the proceeds of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#FinancialTransaction
	 * CorporateActionDistribution.FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution
	 * CorporateActionDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution of the proceeds of a CA event."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CorporateActionDistribution = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CorporateActionDistribution";
			definition = "Distribution of the proceeds of a CA event.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionDistribution.FinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Management of interest which consists into calculating the interest,
	 * requesting its payment or distributing the interest proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InterestManagement#FinancialTransaction
	 * InterestManagement.FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InterestManagement
	 * InterestManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestManagement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd InterestManagement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "InterestManagement";
			definition = "Management of interest which consists into calculating the interest, requesting its payment or distributing the interest proceeds.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.InterestManagement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InterestManagement.FinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Agreement between two parties to buy and sell assets.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#FinancialTransaction
	 * Trade.FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement between two parties to buy and sell assets."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Trade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Agreement between two parties to buy and sell assets.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.FinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Collateral in or out as a result of collateral management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralMovement#FinancialTransaction
	 * CollateralMovement.FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CollateralMovement
	 * CollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral in or out as a result of collateral management."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd CollateralMovement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMovement";
			definition = "Collateral in or out as a result of collateral management.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.CollateralMovement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CollateralMovement.FinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Transaction executed by the client of a financial institution from/to the
	 * account serviced by the financial institution, such as mortgage payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BankingTransaction#FinancialTransaction
	 * BankingTransaction.FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BankingTransaction
	 * BankingTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankingTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd BankingTransaction = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankingTransaction";
			definition = "Transaction executed by the client of a financial institution from/to the account serviced by the financial institution, such as mortgage payment.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.BankingTransaction.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.BankingTransaction.FinancialTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Information related to a trade and that has to be reported to a
	 * regulatory authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#ReportedTransaction
	 * RegulatoryReport.ReportedTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction25#RegulatoryReporting
	 * CreditTransferTransaction25.RegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction26#RegulatoryReporting
	 * CreditTransferTransaction26.RegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CreditTransferTransaction22#RegulatoryReporting
	 * CreditTransferTransaction22.RegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation21#RegulatoryReporting
	 * DirectDebitTransactionInformation21.RegulatoryReporting}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DirectDebitTransactionInformation22#RegulatoryReporting
	 * DirectDebitTransactionInformation22.RegulatoryReporting}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.FinancialTransaction
	 * FinancialTransaction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to a trade and that has to be reported to a regulatory authority."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RegulatoryReport = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CreditTransferTransaction25.RegulatoryReporting, com.tools20022.repository.msg.CreditTransferTransaction26.RegulatoryReporting,
					com.tools20022.repository.msg.CreditTransferTransaction22.RegulatoryReporting, com.tools20022.repository.msg.DirectDebitTransactionInformation21.RegulatoryReporting,
					com.tools20022.repository.msg.DirectDebitTransactionInformation22.RegulatoryReporting);
			elementContext_lazy = () -> FinancialTransaction.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RegulatoryReport";
			definition = "Information related to a trade and that has to be reported to a regulatory authority.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.ReportedTransaction;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialTransaction";
				definition = "Process which includes the order, the execution, the settlement of trades in the financial domain.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.FinancialTransaction, com.tools20022.repository.entity.CorporateActionDistribution.FinancialTransaction,
						com.tools20022.repository.entity.RegulatoryReport.ReportedTransaction, com.tools20022.repository.entity.CollateralMovement.FinancialTransaction,
						com.tools20022.repository.entity.BankingTransaction.FinancialTransaction, com.tools20022.repository.entity.InterestManagement.FinancialTransaction);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.FinancialTransaction.CorporateActionDistribution, com.tools20022.repository.entity.FinancialTransaction.InterestManagement,
						com.tools20022.repository.entity.FinancialTransaction.Trade, com.tools20022.repository.entity.FinancialTransaction.CollateralMovement, com.tools20022.repository.entity.FinancialTransaction.BankingTransaction,
						com.tools20022.repository.entity.FinancialTransaction.RegulatoryReport);
			}
		});
		return mmObject_lazy.get();
	}
}