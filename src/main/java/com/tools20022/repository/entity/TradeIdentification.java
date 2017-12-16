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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the different identifications associated with a trade.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="TradeIdentification" src="doc-files/TradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
 * TradeIdentification.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
 * TradeIdentification.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
 * TradeIdentification.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmMatchingReference
 * TradeIdentification.mmMatchingReference}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TradeIdentification#mmTrade
 * TradeIdentification.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
 * TradeIdentification.mmUniqueTradeIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
 * TradeIdentification.mmClearingBrokerIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
 * Trade.mmTradeRelatedIdentifications}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PaymentIdentification
 * PaymentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionReferences3
 * TransactionReferences3}</li>
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
 * "TradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a trade."</li>
 * </ul>
 */
public class TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text counterpartyReference;
	/**
	 * Unambiguous identification of the trade allocated by the counterparty.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the trade allocated by the counterparty."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCounterpartyReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the trade allocated by the counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getCounterpartyReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text identification;
	/**
	 * Reference assigned to the trade by the investor or the trading party.
	 * This reference will be used throughout the trade life cycle to
	 * access/update the trade details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CurrencyExchange5#mmContractIdentification
	 * CurrencyExchange5.mmContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ExchangeRate1#mmContractIdentification
	 * ExchangeRate1.mmContractIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences4#mmPaymentInformationIdentification
	 * TransactionReferences4.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CertificateIdentification1#mmPaymentInformationIdentification
	 * CertificateIdentification1.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalItemAndStatus5#mmOriginalItemIdentification
	 * OriginalItemAndStatus5.mmOriginalItemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationItem6#mmIdentification
	 * NotificationItem6.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction21#mmPaymentInformationIdentification
	 * PaymentInstruction21.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction23.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction21#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction21.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction23#mmPaymentInformationIdentification
	 * PaymentInstruction23.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction24.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentInstruction22#mmPaymentInformationIdentification
	 * PaymentInstruction22.mmPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction22#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction22.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction20#mmOriginalPaymentInformationIdentification
	 * OriginalPaymentInstruction20.mmOriginalPaymentInformationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorrectivePaymentInitiation2#mmPaymentInformationIdentification
	 * CorrectivePaymentInitiation2.mmPaymentInformationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CurrencyExchange5.mmContractIdentification, ExchangeRate1.mmContractIdentification, TransactionReferences4.mmPaymentInformationIdentification,
					CertificateIdentification1.mmPaymentInformationIdentification, OriginalItemAndStatus5.mmOriginalItemIdentification, NotificationItem6.mmIdentification, PaymentInstruction21.mmPaymentInformationIdentification,
					OriginalPaymentInstruction23.mmOriginalPaymentInformationIdentification, OriginalPaymentInstruction21.mmOriginalPaymentInformationIdentification, PaymentInstruction23.mmPaymentInformationIdentification,
					OriginalPaymentInstruction24.mmOriginalPaymentInformationIdentification, PaymentInstruction22.mmPaymentInformationIdentification, OriginalPaymentInstruction22.mmOriginalPaymentInformationIdentification,
					OriginalPaymentInstruction20.mmOriginalPaymentInformationIdentification, CorrectivePaymentInitiation2.mmPaymentInformationIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Identification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text commonIdentification;
	/**
	 * Unique reference agreed upon by the two trade counterparties to identify
	 * the trade.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCommonIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getCommonIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text matchingReference;
	/**
	 * Reference assigned by a matching system when the trade is matched.
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned by a matching system when the trade is matched."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMatchingReference = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MatchingReference";
			definition = "Reference assigned by a matching system when the trade is matched.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getMatchingReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Trade trade;
	/**
	 * Specifies the trade for which identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trade for which identifications are provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Specifies the trade for which identifications are provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Max35Text uniqueTradeIdentifier;
	/**
	 * This field specifies the unique transaction identifier (UTI) to be
	 * created at the time a transaction is first executed, shared with all
	 * registered entities and counterparties involved in the transaction, and
	 * used to track that particular transaction over its life. This identifier
	 * can also be known as the Unique Swap Identifier (USI).
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
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UniqueTradeIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmUniqueTradeIdentifier = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UniqueTradeIdentifier";
			definition = "This field specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return TradeIdentification.class.getMethod("getUniqueTradeIdentifier", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ClearingBrokerIdentification> clearingBrokerIdentification;
	/**
	 * Reference number assigned by the clearing broker.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification#mmRelatedTradeIdentification
	 * ClearingBrokerIdentification.mmRelatedTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ClearingBrokerIdentification
	 * ClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification
	 * TradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference number assigned by the clearing broker."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmClearingBrokerIdentification = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Reference number assigned by the clearing broker.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmRelatedTradeIdentification;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ClearingBrokerIdentification.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeIdentification";
				definition = "Specifies the different identifications associated with a trade.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications, com.tools20022.repository.entity.ClearingBrokerIdentification.mmRelatedTradeIdentification);
				subType_lazy = () -> Arrays.asList(SecuritiesTradeIdentification.mmObject(), PaymentIdentification.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.TradeIdentification.mmCounterpartyReference, com.tools20022.repository.entity.TradeIdentification.mmIdentification,
						com.tools20022.repository.entity.TradeIdentification.mmCommonIdentification, com.tools20022.repository.entity.TradeIdentification.mmMatchingReference, com.tools20022.repository.entity.TradeIdentification.mmTrade,
						com.tools20022.repository.entity.TradeIdentification.mmUniqueTradeIdentifier, com.tools20022.repository.entity.TradeIdentification.mmClearingBrokerIdentification);
				derivationComponent_lazy = () -> Arrays.asList(TransactionReferences3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return TradeIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCounterpartyReference() {
		return counterpartyReference;
	}

	public void setCounterpartyReference(Max35Text counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public void setIdentification(Max35Text identification) {
		this.identification = identification;
	}

	public Max35Text getCommonIdentification() {
		return commonIdentification;
	}

	public void setCommonIdentification(Max35Text commonIdentification) {
		this.commonIdentification = commonIdentification;
	}

	public Max35Text getMatchingReference() {
		return matchingReference;
	}

	public void setMatchingReference(Max35Text matchingReference) {
		this.matchingReference = matchingReference;
	}

	public Trade getTrade() {
		return trade;
	}

	public void setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = trade;
	}

	public Max35Text getUniqueTradeIdentifier() {
		return uniqueTradeIdentifier;
	}

	public void setUniqueTradeIdentifier(Max35Text uniqueTradeIdentifier) {
		this.uniqueTradeIdentifier = uniqueTradeIdentifier;
	}

	public List<ClearingBrokerIdentification> getClearingBrokerIdentification() {
		return clearingBrokerIdentification;
	}

	public void setClearingBrokerIdentification(List<com.tools20022.repository.entity.ClearingBrokerIdentification> clearingBrokerIdentification) {
		this.clearingBrokerIdentification = clearingBrokerIdentification;
	}
}