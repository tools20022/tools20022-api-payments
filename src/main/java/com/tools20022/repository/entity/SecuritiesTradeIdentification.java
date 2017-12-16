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
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.References3;
import com.tools20022.repository.msg.TransactionReferences3;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a securities
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeIdentification"
 * src="doc-files/SecuritiesTradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmMarketInfrastructureTransactionIdentification
 * SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmProcessorTransactionIdentification
 * SecuritiesTradeIdentification.mmProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmPoolIdentification
 * SecuritiesTradeIdentification.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCollateralTransactionIdentification
 * SecuritiesTradeIdentification.mmCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmClientTripartyCollateralTransactionIdentification
 * SecuritiesTradeIdentification.
 * mmClientTripartyCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
 * SecuritiesTradeIdentification.
 * mmTripartyAgentCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmBasketIdentification
 * SecuritiesTradeIdentification.mmBasketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmProgramIdentification
 * SecuritiesTradeIdentification.mmProgramIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmBlockIdentification
 * SecuritiesTradeIdentification.mmBlockIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmAllocationIdentification
 * SecuritiesTradeIdentification.mmAllocationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmComplianceIdentification
 * SecuritiesTradeIdentification.mmComplianceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCSDTransactionIdentification
 * SecuritiesTradeIdentification.mmCSDTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCentralCounterpartyTransactionIdentification
 * SecuritiesTradeIdentification.mmCentralCounterpartyTransactionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCancellationRequestIdentification
 * SecuritiesTradeIdentification.mmCancellationRequestIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.References3 References3}</li>
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
 * "SecuritiesTradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a securities transaction."
 * </li>
 * </ul>
 */
public class SecuritiesTradeIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesTrade identifiedTrade;
	/**
	 * Trade for which one or more identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which one or more identifications are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentifiedTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IdentifiedTrade";
			definition = "Trade for which one or more identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected Max35Text marketInfrastructureTransactionIdentification;
	/**
	 * Identification of a transaction assigned by a market infrastructure other
	 * than a central securities depository, for example, Target2-Securities.
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
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmMarketInfrastructureTransactionIdentification
	 * TransactionReferences3.mmMarketInfrastructureTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketInfrastructureTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(TransactionReferences3.mmMarketInfrastructureTransactionIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getMarketInfrastructureTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text processorTransactionIdentification;
	/**
	 * Identification of the transaction assigned by the processor of the
	 * instruction other than the account owner the account servicer and the
	 * market infrastructure.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProcessorTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getProcessorTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text poolIdentification;
	/**
	 * Collective reference identifying a set of messages.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getPoolIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text collateralTransactionIdentification;
	/**
	 * Unambiguous identification of a collateral transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of a collateral transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getCollateralTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text clientTripartyCollateralTransactionIdentification;
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the client's point of view.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientTripartyCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the client's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClientTripartyCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getClientTripartyCollateralTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text tripartyAgentCollateralTransactionIdentification;
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the triparty agent's point of view.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTripartyAgentCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyAgentCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getTripartyAgentCollateralTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text basketIdentification;
	/**
	 * Identification of a basket trade.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a basket trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasketIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BasketIdentification";
			definition = "Identification of a basket trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getBasketIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text programIdentification;
	/**
	 * Program reference which identifies a program trade.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgramIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Program reference which identifies a program trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProgramIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ProgramIdentification";
			definition = "Program reference which identifies a program trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getProgramIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text blockIdentification;
	/**
	 * Reference of the linked message at the trade/block level which identifies
	 * a centrally matched transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the linked message at the trade/block level which identifies a centrally matched transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBlockIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BlockIdentification";
			definition = "Reference of the linked message at the trade/block level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getBlockIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text allocationIdentification;
	/**
	 * Identification at the allocation level.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification at the allocation level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAllocationIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AllocationIdentification";
			definition = "Identification at the allocation level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getAllocationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text complianceIdentification;
	/**
	 * Identification which represents this transaction for compliance purposes.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification which represents this transaction for compliance purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmComplianceIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification which represents this transaction for compliance purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getComplianceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text cSDTransactionIdentification;
	/**
	 * Identification given by the central securities depository to the
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification given by the central securities depository  to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCSDTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CSDTransactionIdentification";
			definition = "Identification given by the central securities depository  to the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getCSDTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text centralCounterpartyTransactionIdentification;
	/**
	 * Identification of the transaction assigned by the central counterparty.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCentralCounterpartyTransactionIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralCounterpartyTransactionIdentification";
			definition = "Identification of the transaction assigned by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getCentralCounterpartyTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text cancellationRequestIdentification;
	/**
	 * Unambiguous identification of the cancellation request as known by the
	 * instructing party.
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the cancellation request as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancellationRequestIdentification = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeIdentification.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Unambiguous identification of the cancellation request as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesTradeIdentification.class.getMethod("getCancellationRequestIdentification", new Class[]{});
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
				name = "SecuritiesTradeIdentification";
				definition = "Specifies the different identifications associated with a securities transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmProcessorTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmPoolIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCollateralTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmClientTripartyCollateralTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmBasketIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmProgramIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmBlockIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmAllocationIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmComplianceIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCSDTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCentralCounterpartyTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCancellationRequestIdentification);
				derivationComponent_lazy = () -> Arrays.asList(References3.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTradeIdentification.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTrade getIdentifiedTrade() {
		return identifiedTrade;
	}

	public void setIdentifiedTrade(com.tools20022.repository.entity.SecuritiesTrade identifiedTrade) {
		this.identifiedTrade = identifiedTrade;
	}

	public Max35Text getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
	}

	public Max35Text getProcessorTransactionIdentification() {
		return processorTransactionIdentification;
	}

	public void setProcessorTransactionIdentification(Max35Text processorTransactionIdentification) {
		this.processorTransactionIdentification = processorTransactionIdentification;
	}

	public Max35Text getPoolIdentification() {
		return poolIdentification;
	}

	public void setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = poolIdentification;
	}

	public Max35Text getCollateralTransactionIdentification() {
		return collateralTransactionIdentification;
	}

	public void setCollateralTransactionIdentification(Max35Text collateralTransactionIdentification) {
		this.collateralTransactionIdentification = collateralTransactionIdentification;
	}

	public Max35Text getClientTripartyCollateralTransactionIdentification() {
		return clientTripartyCollateralTransactionIdentification;
	}

	public void setClientTripartyCollateralTransactionIdentification(Max35Text clientTripartyCollateralTransactionIdentification) {
		this.clientTripartyCollateralTransactionIdentification = clientTripartyCollateralTransactionIdentification;
	}

	public Max35Text getTripartyAgentCollateralTransactionIdentification() {
		return tripartyAgentCollateralTransactionIdentification;
	}

	public void setTripartyAgentCollateralTransactionIdentification(Max35Text tripartyAgentCollateralTransactionIdentification) {
		this.tripartyAgentCollateralTransactionIdentification = tripartyAgentCollateralTransactionIdentification;
	}

	public Max35Text getBasketIdentification() {
		return basketIdentification;
	}

	public void setBasketIdentification(Max35Text basketIdentification) {
		this.basketIdentification = basketIdentification;
	}

	public Max35Text getProgramIdentification() {
		return programIdentification;
	}

	public void setProgramIdentification(Max35Text programIdentification) {
		this.programIdentification = programIdentification;
	}

	public Max35Text getBlockIdentification() {
		return blockIdentification;
	}

	public void setBlockIdentification(Max35Text blockIdentification) {
		this.blockIdentification = blockIdentification;
	}

	public Max35Text getAllocationIdentification() {
		return allocationIdentification;
	}

	public void setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = allocationIdentification;
	}

	public Max35Text getComplianceIdentification() {
		return complianceIdentification;
	}

	public void setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = complianceIdentification;
	}

	public Max35Text getCSDTransactionIdentification() {
		return cSDTransactionIdentification;
	}

	public void setCSDTransactionIdentification(Max35Text cSDTransactionIdentification) {
		this.cSDTransactionIdentification = cSDTransactionIdentification;
	}

	public Max35Text getCentralCounterpartyTransactionIdentification() {
		return centralCounterpartyTransactionIdentification;
	}

	public void setCentralCounterpartyTransactionIdentification(Max35Text centralCounterpartyTransactionIdentification) {
		this.centralCounterpartyTransactionIdentification = centralCounterpartyTransactionIdentification;
	}

	public Max35Text getCancellationRequestIdentification() {
		return cancellationRequestIdentification;
	}

	public void setCancellationRequestIdentification(Max35Text cancellationRequestIdentification) {
		this.cancellationRequestIdentification = cancellationRequestIdentification;
	}
}