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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.MoveTypeCode;
import com.tools20022.repository.codeset.OffsetTypeCode;
import com.tools20022.repository.codeset.PriceProtectionScopeCode;
import com.tools20022.repository.codeset.TypeOfDiscretionPriceCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PlusOrMinusIndicator;
import com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Indicates on an order that the trader wishes to display one price in the
 * market but will accept trades at another price.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Discretion" src="doc-files/Discretion.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discretion#mmRelatedOrderExecution
 * Discretion.mmRelatedOrderExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#mmOffset
 * Discretion.mmOffset}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#mmOffsetSign
 * Discretion.mmOffsetSign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Discretion#mmRelatedPriceType
 * Discretion.mmRelatedPriceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#mmMoveType
 * Discretion.mmMoveType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#mmLimitType
 * Discretion.mmLimitType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#mmRoundDirection
 * Discretion.mmRoundDirection}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#mmScope
 * Discretion.mmScope}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Discretion#mmOffsetType
 * Discretion.mmOffsetType}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmOrderPriceStrategy
 * SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = FIXSynonym: DiscretionInst</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Discretion"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price."
 * </li>
 * </ul>
 */
public class Discretion {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesOrderExecutionInstruction relatedOrderExecution;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction#mmOrderPriceStrategy
	 * SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderExecutionInstruction
	 * SecuritiesOrderExecutionInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrderExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order instruction for which a discretion is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Discretion, Optional<SecuritiesOrderExecutionInstruction>> mmRelatedOrderExecution = new MMBusinessAssociationEnd<Discretion, Optional<SecuritiesOrderExecutionInstruction>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrderExecution";
			definition = "Order instruction for which a discretion is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesOrderExecutionInstruction.mmObject();
		}

		@Override
		public Optional<SecuritiesOrderExecutionInstruction> getValue(Discretion obj) {
			return obj.getRelatedOrderExecution();
		}

		@Override
		public void setValue(Discretion obj, Optional<SecuritiesOrderExecutionInstruction> value) {
			obj.setRelatedOrderExecution(value.orElse(null));
		}
	};
	protected CurrencyAndAmount offset;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount added to the 'related to' price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discretion, CurrencyAndAmount> mmOffset = new MMBusinessAttribute<Discretion, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Offset";
			definition = "Amount added to the 'related to' price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(Discretion obj) {
			return obj.getOffset();
		}

		@Override
		public void setValue(Discretion obj, CurrencyAndAmount value) {
			obj.setOffset(value);
		}
	};
	protected PlusOrMinusIndicator offsetSign;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PlusOrMinusIndicator
	 * PlusOrMinusIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 389</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetSign"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the offset should be added or subtracted from the related price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discretion, PlusOrMinusIndicator> mmOffsetSign = new MMBusinessAttribute<Discretion, PlusOrMinusIndicator>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "389"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffsetSign";
			definition = "Indicates whether the offset should be added or subtracted from the related price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PlusOrMinusIndicator.mmObject();
		}

		@Override
		public PlusOrMinusIndicator getValue(Discretion obj) {
			return obj.getOffsetSign();
		}

		@Override
		public void setValue(Discretion obj, PlusOrMinusIndicator value) {
			obj.setOffsetSign(value);
		}
	};
	protected TypeOfDiscretionPriceCode relatedPriceType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfDiscretionPriceCode
	 * TypeOfDiscretionPriceCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 388</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identify the type of price an offset is related to. The offset can either be added or subtracted."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discretion, TypeOfDiscretionPriceCode> mmRelatedPriceType = new MMBusinessAttribute<Discretion, TypeOfDiscretionPriceCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "388"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPriceType";
			definition = "Identify the type of price an offset is related to. The offset can either be added or subtracted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfDiscretionPriceCode.mmObject();
		}

		@Override
		public TypeOfDiscretionPriceCode getValue(Discretion obj) {
			return obj.getRelatedPriceType();
		}

		@Override
		public void setValue(Discretion obj, TypeOfDiscretionPriceCode value) {
			obj.setRelatedPriceType(value);
		}
	};
	protected MoveTypeCode moveType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.MoveTypeCode
	 * MoveTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes whether discretion price is static/fixed or floats."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discretion, MoveTypeCode> mmMoveType = new MMBusinessAttribute<Discretion, MoveTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoveType";
			definition = "Describes whether discretion price is static/fixed or floats.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MoveTypeCode.mmObject();
		}

		@Override
		public MoveTypeCode getValue(Discretion obj) {
			return obj.getMoveType();
		}

		@Override
		public void setValue(Discretion obj, MoveTypeCode value) {
			obj.setMoveType(value);
		}
	};
	protected Max35Text limitType;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discretion, Max35Text> mmLimitType = new MMBusinessAttribute<Discretion, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LimitType";
			definition = "Specifies the nature of the resulting discretion price (e.g. or better limit, strict limit etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Discretion obj) {
			return obj.getLimitType();
		}

		@Override
		public void setValue(Discretion obj, Max35Text value) {
			obj.setLimitType(value);
		}
	};
	protected Max35Text roundDirection;
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
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discretion, Max35Text> mmRoundDirection = new MMBusinessAttribute<Discretion, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundDirection";
			definition = "If the calculated discretion price is not a valid tick price, specifies how to round the price (e.g. to be more or less aggressive)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Discretion obj) {
			return obj.getRoundDirection();
		}

		@Override
		public void setValue(Discretion obj, Max35Text value) {
			obj.setRoundDirection(value);
		}
	};
	protected PriceProtectionScopeCode scope;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode
	 * PriceProtectionScopeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Scope"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The scope of \"related to\" price of the discretion (e.g. local, global etc)"
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discretion, PriceProtectionScopeCode> mmScope = new MMBusinessAttribute<Discretion, PriceProtectionScopeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Scope";
			definition = "The scope of \"related to\" price of the discretion (e.g. local, global etc)";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceProtectionScopeCode.mmObject();
		}

		@Override
		public PriceProtectionScopeCode getValue(Discretion obj) {
			return obj.getScope();
		}

		@Override
		public void setValue(Discretion obj, PriceProtectionScopeCode value) {
			obj.setScope(value);
		}
	};
	protected OffsetTypeCode offsetType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OffsetTypeCode
	 * OffsetTypeCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Discretion Discretion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffsetType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Describes the type of Discretion Offset ."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Discretion, OffsetTypeCode> mmOffsetType = new MMBusinessAttribute<Discretion, OffsetTypeCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Discretion.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OffsetType";
			definition = "Describes the type of Discretion Offset .";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> OffsetTypeCode.mmObject();
		}

		@Override
		public OffsetTypeCode getValue(Discretion obj) {
			return obj.getOffsetType();
		}

		@Override
		public void setValue(Discretion obj, OffsetTypeCode value) {
			obj.setOffsetType(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "DiscretionInst"));
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Discretion";
				definition = "Indicates on an order that the trader wishes to display one price in the market but will accept trades at another price.";
				associationDomain_lazy = () -> Arrays.asList(SecuritiesOrderExecutionInstruction.mmOrderPriceStrategy);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Discretion.mmRelatedOrderExecution, com.tools20022.repository.entity.Discretion.mmOffset, com.tools20022.repository.entity.Discretion.mmOffsetSign,
						com.tools20022.repository.entity.Discretion.mmRelatedPriceType, com.tools20022.repository.entity.Discretion.mmMoveType, com.tools20022.repository.entity.Discretion.mmLimitType,
						com.tools20022.repository.entity.Discretion.mmRoundDirection, com.tools20022.repository.entity.Discretion.mmScope, com.tools20022.repository.entity.Discretion.mmOffsetType);
			}

			@Override
			public Class<?> getInstanceClass() {
				return Discretion.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecuritiesOrderExecutionInstruction> getRelatedOrderExecution() {
		return relatedOrderExecution == null ? Optional.empty() : Optional.of(relatedOrderExecution);
	}

	public Discretion setRelatedOrderExecution(SecuritiesOrderExecutionInstruction relatedOrderExecution) {
		this.relatedOrderExecution = relatedOrderExecution;
		return this;
	}

	public CurrencyAndAmount getOffset() {
		return offset;
	}

	public Discretion setOffset(CurrencyAndAmount offset) {
		this.offset = Objects.requireNonNull(offset);
		return this;
	}

	public PlusOrMinusIndicator getOffsetSign() {
		return offsetSign;
	}

	public Discretion setOffsetSign(PlusOrMinusIndicator offsetSign) {
		this.offsetSign = Objects.requireNonNull(offsetSign);
		return this;
	}

	public TypeOfDiscretionPriceCode getRelatedPriceType() {
		return relatedPriceType;
	}

	public Discretion setRelatedPriceType(TypeOfDiscretionPriceCode relatedPriceType) {
		this.relatedPriceType = Objects.requireNonNull(relatedPriceType);
		return this;
	}

	public MoveTypeCode getMoveType() {
		return moveType;
	}

	public Discretion setMoveType(MoveTypeCode moveType) {
		this.moveType = Objects.requireNonNull(moveType);
		return this;
	}

	public Max35Text getLimitType() {
		return limitType;
	}

	public Discretion setLimitType(Max35Text limitType) {
		this.limitType = Objects.requireNonNull(limitType);
		return this;
	}

	public Max35Text getRoundDirection() {
		return roundDirection;
	}

	public Discretion setRoundDirection(Max35Text roundDirection) {
		this.roundDirection = Objects.requireNonNull(roundDirection);
		return this;
	}

	public PriceProtectionScopeCode getScope() {
		return scope;
	}

	public Discretion setScope(PriceProtectionScopeCode scope) {
		this.scope = Objects.requireNonNull(scope);
		return this;
	}

	public OffsetTypeCode getOffsetType() {
		return offsetType;
	}

	public Discretion setOffsetType(OffsetTypeCode offsetType) {
		this.offsetType = Objects.requireNonNull(offsetType);
		return this;
	}
}