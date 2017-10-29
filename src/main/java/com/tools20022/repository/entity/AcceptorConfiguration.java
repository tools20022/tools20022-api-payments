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
import com.tools20022.repository.codeset.BatchTransactionTypeCode;
import com.tools20022.repository.codeset.ExchangePolicyCode;
import com.tools20022.repository.codeset.FinancialCaptureCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Acceptor parameters to be downloaded from the terminal management system.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AcceptorConfiguration"
 * src="doc-files/AcceptorConfiguration.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ApplicationIdentification
 * AcceptorConfiguration.ApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#FinancialCapture
 * AcceptorConfiguration.FinancialCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#BatchTransferContent
 * AcceptorConfiguration.BatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ExchangePolicy
 * AcceptorConfiguration.ExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#MaximumNumber
 * AcceptorConfiguration.MaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#MaximumAmount
 * AcceptorConfiguration.MaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ReconciliationByAcquirer
 * AcceptorConfiguration.ReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#TotalsPerCurrency
 * AcceptorConfiguration.TotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ProtectCardData
 * AcceptorConfiguration.ProtectCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#RetailerParameters
 * AcceptorConfiguration.RetailerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ApplicationParameters
 * AcceptorConfiguration.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#TerminalManagementSystem
 * AcceptorConfiguration.TerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#ApplicationVersion
 * AcceptorConfiguration.ApplicationVersion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#AcceptorConfiguration
 * TerminalManagementSystem.AcceptorConfiguration}</li>
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
 * "AcceptorConfiguration"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Acceptor parameters to be downloaded from the terminal management system."</li>
 * </ul>
 */
public class AcceptorConfiguration {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identification of the payment application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the payment application."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicationIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	/**
	 * Mode for the financial capture of the transaction by the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCaptureCode
	 * FinancialCaptureCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCapture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mode for the financial capture of the transaction by the acquirer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FinancialCapture = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FinancialCaptureCode.mmObject();
		}
	};
	/**
	 * Types of transaction to include in the batch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionTypeCode
	 * BatchTransactionTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of transaction to include in the batch."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BatchTransferContent = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BatchTransactionTypeCode.mmObject();
		}
	};
	/**
	 * Exchange policy between parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExchangePolicyCode
	 * ExchangePolicyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangePolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange policy between parties."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ExchangePolicy = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExchangePolicyCode.mmObject();
		}
	};
	/**
	 * Maximum number of transactions without exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maximum number of transactions without exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumNumber = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	/**
	 * Maximum cumulative amount of the transactions without exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum cumulative amount of the transactions without exchange."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute MaximumAmount = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Indicates the reconciliation period is assigned by the acquirer instead
	 * of the acceptor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationByAcquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ReconciliationByAcquirer = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicates the reconciliation total amounts are computed per currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation total amounts are computed per currency."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute TotalsPerCurrency = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Indicator to require protection of sensitive card data in messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to require protection of sensitive card data in messages."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ProtectCardData = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	/**
	 * Acceptor parameters dedicated to the retailer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RetailerParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acceptor parameters dedicated to the retailer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute RetailerParameters = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RetailerParameters";
			definition = "Acceptor parameters dedicated to the retailer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Configuration parameters attached to the payment application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration parameters attached to the payment application."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicationParameters = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Configuration parameters attached to the payment application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	/**
	 * Terminal management system for which an acceptor configuration is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#AcceptorConfiguration
	 * TerminalManagementSystem.AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
	 * TerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalManagementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal management system for which an acceptor configuration is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd TerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system for which an acceptor configuration is provided.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.AcceptorConfiguration;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Version of the application.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the application."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicationVersion = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> AcceptorConfiguration.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicationVersion";
			definition = "Version of the application.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfiguration";
				definition = "Acceptor parameters to be downloaded from the terminal management system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.AcceptorConfiguration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AcceptorConfiguration.ApplicationIdentification, com.tools20022.repository.entity.AcceptorConfiguration.FinancialCapture,
						com.tools20022.repository.entity.AcceptorConfiguration.BatchTransferContent, com.tools20022.repository.entity.AcceptorConfiguration.ExchangePolicy,
						com.tools20022.repository.entity.AcceptorConfiguration.MaximumNumber, com.tools20022.repository.entity.AcceptorConfiguration.MaximumAmount,
						com.tools20022.repository.entity.AcceptorConfiguration.ReconciliationByAcquirer, com.tools20022.repository.entity.AcceptorConfiguration.TotalsPerCurrency,
						com.tools20022.repository.entity.AcceptorConfiguration.ProtectCardData, com.tools20022.repository.entity.AcceptorConfiguration.RetailerParameters,
						com.tools20022.repository.entity.AcceptorConfiguration.ApplicationParameters, com.tools20022.repository.entity.AcceptorConfiguration.TerminalManagementSystem,
						com.tools20022.repository.entity.AcceptorConfiguration.ApplicationVersion);
			}
		});
		return mmObject_lazy.get();
	}
}