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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	public static final MMBusinessAttribute mmApplicationIdentification = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getApplicationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected FinancialCaptureCode financialCapture;
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
	public static final MMBusinessAttribute mmFinancialCapture = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getFinancialCapture", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BatchTransactionTypeCode batchTransferContent;
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
	public static final MMBusinessAttribute mmBatchTransferContent = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getBatchTransferContent", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ExchangePolicyCode exchangePolicy;
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
	public static final MMBusinessAttribute mmExchangePolicy = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getExchangePolicy", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Number maximumNumber;
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
	public static final MMBusinessAttribute mmMaximumNumber = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getMaximumNumber", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ImpliedCurrencyAndAmount maximumAmount;
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
	public static final MMBusinessAttribute mmMaximumAmount = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getMaximumAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator reconciliationByAcquirer;
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
	public static final MMBusinessAttribute mmReconciliationByAcquirer = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getReconciliationByAcquirer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator totalsPerCurrency;
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
	public static final MMBusinessAttribute mmTotalsPerCurrency = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getTotalsPerCurrency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TrueFalseIndicator protectCardData;
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
	public static final MMBusinessAttribute mmProtectCardData = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getProtectCardData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max10000Binary retailerParameters;
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
	public static final MMBusinessAttribute mmRetailerParameters = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getRetailerParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max10000Binary applicationParameters;
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
	public static final MMBusinessAttribute mmApplicationParameters = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getApplicationParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TerminalManagementSystem terminalManagementSystem;
	/**
	 * Terminal management system for which an acceptor configuration is
	 * provided.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmTerminalManagementSystem = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TerminalManagementSystem";
			definition = "Terminal management system for which an acceptor configuration is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmAcceptorConfiguration;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TerminalManagementSystem.mmObject();
		}
	};
	protected Max35Text applicationVersion;
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
	public static final MMBusinessAttribute mmApplicationVersion = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return AcceptorConfiguration.class.getMethod("getApplicationVersion", new Class[]{});
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
				name = "AcceptorConfiguration";
				definition = "Acceptor parameters to be downloaded from the terminal management system.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TerminalManagementSystem.mmAcceptorConfiguration);
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

	public void setApplicationIdentification(Max35Text applicationIdentification) {
		this.applicationIdentification = applicationIdentification;
	}

	public FinancialCaptureCode getFinancialCapture() {
		return financialCapture;
	}

	public void setFinancialCapture(FinancialCaptureCode financialCapture) {
		this.financialCapture = financialCapture;
	}

	public BatchTransactionTypeCode getBatchTransferContent() {
		return batchTransferContent;
	}

	public void setBatchTransferContent(BatchTransactionTypeCode batchTransferContent) {
		this.batchTransferContent = batchTransferContent;
	}

	public ExchangePolicyCode getExchangePolicy() {
		return exchangePolicy;
	}

	public void setExchangePolicy(ExchangePolicyCode exchangePolicy) {
		this.exchangePolicy = exchangePolicy;
	}

	public Number getMaximumNumber() {
		return maximumNumber;
	}

	public void setMaximumNumber(Number maximumNumber) {
		this.maximumNumber = maximumNumber;
	}

	public ImpliedCurrencyAndAmount getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(ImpliedCurrencyAndAmount maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public TrueFalseIndicator getReconciliationByAcquirer() {
		return reconciliationByAcquirer;
	}

	public void setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = reconciliationByAcquirer;
	}

	public TrueFalseIndicator getTotalsPerCurrency() {
		return totalsPerCurrency;
	}

	public void setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = totalsPerCurrency;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public void setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = protectCardData;
	}

	public Max10000Binary getRetailerParameters() {
		return retailerParameters;
	}

	public void setRetailerParameters(Max10000Binary retailerParameters) {
		this.retailerParameters = retailerParameters;
	}

	public Max10000Binary getApplicationParameters() {
		return applicationParameters;
	}

	public void setApplicationParameters(Max10000Binary applicationParameters) {
		this.applicationParameters = applicationParameters;
	}

	public TerminalManagementSystem getTerminalManagementSystem() {
		return terminalManagementSystem;
	}

	public void setTerminalManagementSystem(com.tools20022.repository.entity.TerminalManagementSystem terminalManagementSystem) {
		this.terminalManagementSystem = terminalManagementSystem;
	}

	public Max35Text getApplicationVersion() {
		return applicationVersion;
	}

	public void setApplicationVersion(Max35Text applicationVersion) {
		this.applicationVersion = applicationVersion;
	}
}