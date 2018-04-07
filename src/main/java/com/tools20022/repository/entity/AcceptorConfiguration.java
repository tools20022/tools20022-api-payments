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
import com.tools20022.repository.codeset.BatchTransactionTypeCode;
import com.tools20022.repository.codeset.ExchangePolicyCode;
import com.tools20022.repository.codeset.FinancialCaptureCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

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
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationIdentification
 * AcceptorConfiguration.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmFinancialCapture
 * AcceptorConfiguration.mmFinancialCapture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmBatchTransferContent
 * AcceptorConfiguration.mmBatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmExchangePolicy
 * AcceptorConfiguration.mmExchangePolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumNumber
 * AcceptorConfiguration.mmMaximumNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmMaximumAmount
 * AcceptorConfiguration.mmMaximumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmReconciliationByAcquirer
 * AcceptorConfiguration.mmReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTotalsPerCurrency
 * AcceptorConfiguration.mmTotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmProtectCardData
 * AcceptorConfiguration.mmProtectCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmRetailerParameters
 * AcceptorConfiguration.mmRetailerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationParameters
 * AcceptorConfiguration.mmApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationVersion
 * AcceptorConfiguration.mmApplicationVersion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAcceptorConfiguration
 * TerminalManagementSystem.mmAcceptorConfiguration}</li>
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
	protected Max35Text applicationIdentification;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, Max35Text> mmApplicationIdentification = new MMBusinessAttribute<AcceptorConfiguration, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AcceptorConfiguration obj) {
			return obj.getApplicationIdentification();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Max35Text value) {
			obj.setApplicationIdentification(value);
		}
	};
	protected FinancialCaptureCode financialCapture;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, FinancialCaptureCode> mmFinancialCapture = new MMBusinessAttribute<AcceptorConfiguration, FinancialCaptureCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCapture";
			definition = "Mode for the financial capture of the transaction by the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FinancialCaptureCode.mmObject();
		}

		@Override
		public FinancialCaptureCode getValue(AcceptorConfiguration obj) {
			return obj.getFinancialCapture();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, FinancialCaptureCode value) {
			obj.setFinancialCapture(value);
		}
	};
	protected BatchTransactionTypeCode batchTransferContent;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, BatchTransactionTypeCode> mmBatchTransferContent = new MMBusinessAttribute<AcceptorConfiguration, BatchTransactionTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BatchTransactionTypeCode.mmObject();
		}

		@Override
		public BatchTransactionTypeCode getValue(AcceptorConfiguration obj) {
			return obj.getBatchTransferContent();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, BatchTransactionTypeCode value) {
			obj.setBatchTransferContent(value);
		}
	};
	protected ExchangePolicyCode exchangePolicy;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, ExchangePolicyCode> mmExchangePolicy = new MMBusinessAttribute<AcceptorConfiguration, ExchangePolicyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExchangePolicy";
			definition = "Exchange policy between parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ExchangePolicyCode.mmObject();
		}

		@Override
		public ExchangePolicyCode getValue(AcceptorConfiguration obj) {
			return obj.getExchangePolicy();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, ExchangePolicyCode value) {
			obj.setExchangePolicy(value);
		}
	};
	protected Number maximumNumber;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, Number> mmMaximumNumber = new MMBusinessAttribute<AcceptorConfiguration, Number>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumNumber";
			definition = "Maximum number of transactions without exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(AcceptorConfiguration obj) {
			return obj.getMaximumNumber();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Number value) {
			obj.setMaximumNumber(value);
		}
	};
	protected ImpliedCurrencyAndAmount maximumAmount;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, ImpliedCurrencyAndAmount> mmMaximumAmount = new MMBusinessAttribute<AcceptorConfiguration, ImpliedCurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumAmount";
			definition = "Maximum cumulative amount of the transactions without exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(AcceptorConfiguration obj) {
			return obj.getMaximumAmount();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, ImpliedCurrencyAndAmount value) {
			obj.setMaximumAmount(value);
		}
	};
	protected TrueFalseIndicator reconciliationByAcquirer;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator> mmReconciliationByAcquirer = new MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(AcceptorConfiguration obj) {
			return obj.getReconciliationByAcquirer();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, TrueFalseIndicator value) {
			obj.setReconciliationByAcquirer(value);
		}
	};
	protected TrueFalseIndicator totalsPerCurrency;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator> mmTotalsPerCurrency = new MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(AcceptorConfiguration obj) {
			return obj.getTotalsPerCurrency();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, TrueFalseIndicator value) {
			obj.setTotalsPerCurrency(value);
		}
	};
	protected TrueFalseIndicator protectCardData;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator> mmProtectCardData = new MMBusinessAttribute<AcceptorConfiguration, TrueFalseIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}

		@Override
		public TrueFalseIndicator getValue(AcceptorConfiguration obj) {
			return obj.getProtectCardData();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, TrueFalseIndicator value) {
			obj.setProtectCardData(value);
		}
	};
	protected Max10000Binary retailerParameters;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, Max10000Binary> mmRetailerParameters = new MMBusinessAttribute<AcceptorConfiguration, Max10000Binary>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RetailerParameters";
			definition = "Acceptor parameters dedicated to the retailer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Max10000Binary getValue(AcceptorConfiguration obj) {
			return obj.getRetailerParameters();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Max10000Binary value) {
			obj.setRetailerParameters(value);
		}
	};
	protected Max10000Binary applicationParameters;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, Max10000Binary> mmApplicationParameters = new MMBusinessAttribute<AcceptorConfiguration, Max10000Binary>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationParameters";
			definition = "Configuration parameters attached to the payment application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Max10000Binary getValue(AcceptorConfiguration obj) {
			return obj.getApplicationParameters();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Max10000Binary value) {
			obj.setApplicationParameters(value);
		}
	};
	protected TerminalManagementSystem terminalManagementSystem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmAcceptorConfiguration
	 * TerminalManagementSystem.mmAcceptorConfiguration}</li>
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
	public static final MMBusinessAssociationEnd<AcceptorConfiguration, Optional<TerminalManagementSystem>> mmTerminalManagementSystem = new MMBusinessAssociationEnd<AcceptorConfiguration, Optional<TerminalManagementSystem>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system for which an acceptor configuration is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> TerminalManagementSystem.mmAcceptorConfiguration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> TerminalManagementSystem.mmObject();
		}

		@Override
		public Optional<TerminalManagementSystem> getValue(AcceptorConfiguration obj) {
			return obj.getTerminalManagementSystem();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Optional<TerminalManagementSystem> value) {
			obj.setTerminalManagementSystem(value.orElse(null));
		}
	};
	protected Max35Text applicationVersion;
	/**
	 * 
	 <p>
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
	public static final MMBusinessAttribute<AcceptorConfiguration, Max35Text> mmApplicationVersion = new MMBusinessAttribute<AcceptorConfiguration, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ApplicationVersion";
			definition = "Version of the application.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AcceptorConfiguration obj) {
			return obj.getApplicationVersion();
		}

		@Override
		public void setValue(AcceptorConfiguration obj, Max35Text value) {
			obj.setApplicationVersion(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorConfiguration";
				definition = "Acceptor parameters to be downloaded from the terminal management system.";
				associationDomain_lazy = () -> Arrays.asList(TerminalManagementSystem.mmAcceptorConfiguration);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AcceptorConfiguration.mmApplicationIdentification, com.tools20022.repository.entity.AcceptorConfiguration.mmFinancialCapture,
						com.tools20022.repository.entity.AcceptorConfiguration.mmBatchTransferContent, com.tools20022.repository.entity.AcceptorConfiguration.mmExchangePolicy,
						com.tools20022.repository.entity.AcceptorConfiguration.mmMaximumNumber, com.tools20022.repository.entity.AcceptorConfiguration.mmMaximumAmount,
						com.tools20022.repository.entity.AcceptorConfiguration.mmReconciliationByAcquirer, com.tools20022.repository.entity.AcceptorConfiguration.mmTotalsPerCurrency,
						com.tools20022.repository.entity.AcceptorConfiguration.mmProtectCardData, com.tools20022.repository.entity.AcceptorConfiguration.mmRetailerParameters,
						com.tools20022.repository.entity.AcceptorConfiguration.mmApplicationParameters, com.tools20022.repository.entity.AcceptorConfiguration.mmTerminalManagementSystem,
						com.tools20022.repository.entity.AcceptorConfiguration.mmApplicationVersion);
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorConfiguration.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getApplicationIdentification() {
		return applicationIdentification;
	}

	public AcceptorConfiguration setApplicationIdentification(Max35Text applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public FinancialCaptureCode getFinancialCapture() {
		return financialCapture;
	}

	public AcceptorConfiguration setFinancialCapture(FinancialCaptureCode financialCapture) {
		this.financialCapture = Objects.requireNonNull(financialCapture);
		return this;
	}

	public BatchTransactionTypeCode getBatchTransferContent() {
		return batchTransferContent;
	}

	public AcceptorConfiguration setBatchTransferContent(BatchTransactionTypeCode batchTransferContent) {
		this.batchTransferContent = Objects.requireNonNull(batchTransferContent);
		return this;
	}

	public ExchangePolicyCode getExchangePolicy() {
		return exchangePolicy;
	}

	public AcceptorConfiguration setExchangePolicy(ExchangePolicyCode exchangePolicy) {
		this.exchangePolicy = Objects.requireNonNull(exchangePolicy);
		return this;
	}

	public Number getMaximumNumber() {
		return maximumNumber;
	}

	public AcceptorConfiguration setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = Objects.requireNonNull(maximumNumber);
		return this;
	}

	public ImpliedCurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public AcceptorConfiguration setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = Objects.requireNonNull(maximumAmount);
		return this;
	}

	public TrueFalseIndicator getReconciliationByAcquirer() {
		return reconciliationByAcquirer;
	}

	public AcceptorConfiguration setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = Objects.requireNonNull(reconciliationByAcquirer);
		return this;
	}

	public TrueFalseIndicator getTotalsPerCurrency() {
		return totalsPerCurrency;
	}

	public AcceptorConfiguration setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = Objects.requireNonNull(totalsPerCurrency);
		return this;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public AcceptorConfiguration setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = Objects.requireNonNull(protectCardData);
		return this;
	}

	public Max10000Binary getRetailerParameters() {
		return retailerParameters;
	}

	public AcceptorConfiguration setRetailerParameters(Max10000Binary retailerParameters) {
		this.retailerParameters = Objects.requireNonNull(retailerParameters);
		return this;
	}

	public Max10000Binary getApplicationParameters() {
		return applicationParameters;
	}

	public AcceptorConfiguration setApplicationParameters(Max10000Binary applicationParameters) {
		this.applicationParameters = Objects.requireNonNull(applicationParameters);
		return this;
	}

	public Optional<TerminalManagementSystem> getTerminalManagementSystem() {
		return terminalManagementSystem == null ? Optional.empty() : Optional.of(terminalManagementSystem);
	}

	public AcceptorConfiguration setTerminalManagementSystem(TerminalManagementSystem terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
		return this;
	}

	public Max35Text getApplicationVersion() {
		return applicationVersion;
	}

	public AcceptorConfiguration setApplicationVersion(Max35Text applicationVersion) {
		this.applicationVersion = Objects.requireNonNull(applicationVersion);
		return this;
	}
}