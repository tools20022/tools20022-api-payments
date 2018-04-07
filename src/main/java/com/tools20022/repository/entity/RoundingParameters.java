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
import com.tools20022.repository.codeset.RoundingDirectionCode;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.entity.InvestmentAccountService;
import com.tools20022.repository.entity.SecuritiesPegOrderInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;

/**
 * Parameters applied to a fractional number.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="RoundingParameters" src="doc-files/RoundingParameters.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmInvestmentAccountService
 * RoundingParameters.mmInvestmentAccountService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingModulus
 * RoundingParameters.mmRoundingModulus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingDirection
 * RoundingParameters.mmRoundingDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRelatedPegOrderInstruction
 * RoundingParameters.mmRelatedPegOrderInstruction}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
 * InvestmentAccountService.mmRoundingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmRoundDirection
 * SecuritiesPegOrderInstruction.mmRoundDirection}</li>
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
 * "RoundingParameters"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to a fractional number."</li>
 * </ul>
 */
public class RoundingParameters {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected InvestmentAccountService investmentAccountService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
	 * InvestmentAccountService.mmRoundingMethod}</li>
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
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account services for which rounding parameters are specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RoundingParameters, InvestmentAccountService> mmInvestmentAccountService = new MMBusinessAssociationEnd<RoundingParameters, InvestmentAccountService>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountService";
			definition = "Investment account services for which rounding parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> InvestmentAccountService.mmRoundingMethod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> InvestmentAccountService.mmObject();
		}

		@Override
		public InvestmentAccountService getValue(RoundingParameters obj) {
			return obj.getInvestmentAccountService();
		}

		@Override
		public void setValue(RoundingParameters obj, InvestmentAccountService value) {
			obj.setInvestmentAccountService(value);
		}
	};
	protected DecimalNumber roundingModulus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingModulus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Float value specifying the value to which rounding is required, eg, 10 means round to a multiple of 10 units/shares, 0.5 means round to a multiple of 0.5 units/shares."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RoundingParameters, DecimalNumber> mmRoundingModulus = new MMBusinessAttribute<RoundingParameters, DecimalNumber>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundingModulus";
			definition = "Float value specifying the value to which rounding is required, eg, 10 means round to a multiple of 10 units/shares, 0.5 means round to a multiple of 0.5 units/shares.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(RoundingParameters obj) {
			return obj.getRoundingModulus();
		}

		@Override
		public void setValue(RoundingParameters obj, DecimalNumber value) {
			obj.setRoundingModulus(value);
		}
	};
	protected RoundingDirectionCode roundingDirection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirectionCode
	 * RoundingDirectionCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rounding direction applied to fractional numbers, eg, round up."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<RoundingParameters, RoundingDirectionCode> mmRoundingDirection = new MMBusinessAttribute<RoundingParameters, RoundingDirectionCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RoundingDirection";
			definition = "Rounding direction applied to fractional numbers, eg, round up.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RoundingDirectionCode.mmObject();
		}

		@Override
		public RoundingDirectionCode getValue(RoundingParameters obj) {
			return obj.getRoundingDirection();
		}

		@Override
		public void setValue(RoundingParameters obj, RoundingDirectionCode value) {
			obj.setRoundingDirection(value);
		}
	};
	protected SecuritiesPegOrderInstruction relatedPegOrderInstruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction#mmRoundDirection
	 * SecuritiesPegOrderInstruction.mmRoundDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPegOrderInstruction
	 * SecuritiesPegOrderInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters
	 * RoundingParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPegOrderInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Peg order for which a rounding direction is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<RoundingParameters, SecuritiesPegOrderInstruction> mmRelatedPegOrderInstruction = new MMBusinessAssociationEnd<RoundingParameters, SecuritiesPegOrderInstruction>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPegOrderInstruction";
			definition = "Peg order for which a rounding direction is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> SecuritiesPegOrderInstruction.mmRoundDirection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SecuritiesPegOrderInstruction.mmObject();
		}

		@Override
		public SecuritiesPegOrderInstruction getValue(RoundingParameters obj) {
			return obj.getRelatedPegOrderInstruction();
		}

		@Override
		public void setValue(RoundingParameters obj, SecuritiesPegOrderInstruction value) {
			obj.setRelatedPegOrderInstruction(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RoundingParameters";
				definition = "Parameters applied to a fractional number.";
				associationDomain_lazy = () -> Arrays.asList(InvestmentAccountService.mmRoundingMethod, SecuritiesPegOrderInstruction.mmRoundDirection);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.RoundingParameters.mmInvestmentAccountService, com.tools20022.repository.entity.RoundingParameters.mmRoundingModulus,
						com.tools20022.repository.entity.RoundingParameters.mmRoundingDirection, com.tools20022.repository.entity.RoundingParameters.mmRelatedPegOrderInstruction);
			}

			@Override
			public Class<?> getInstanceClass() {
				return RoundingParameters.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccountService getInvestmentAccountService() {
		return investmentAccountService;
	}

	public RoundingParameters setInvestmentAccountService(InvestmentAccountService investmentAccountService) {
		this.investmentAccountService = Objects.requireNonNull(investmentAccountService);
		return this;
	}

	public DecimalNumber getRoundingModulus() {
		return roundingModulus;
	}

	public RoundingParameters setRoundingModulus(DecimalNumber roundingModulus) {
		this.roundingModulus = Objects.requireNonNull(roundingModulus);
		return this;
	}

	public RoundingDirectionCode getRoundingDirection() {
		return roundingDirection;
	}

	public RoundingParameters setRoundingDirection(RoundingDirectionCode roundingDirection) {
		this.roundingDirection = Objects.requireNonNull(roundingDirection);
		return this;
	}

	public SecuritiesPegOrderInstruction getRelatedPegOrderInstruction() {
		return relatedPegOrderInstruction;
	}

	public RoundingParameters setRelatedPegOrderInstruction(SecuritiesPegOrderInstruction relatedPegOrderInstruction) {
		this.relatedPegOrderInstruction = Objects.requireNonNull(relatedPegOrderInstruction);
		return this;
	}
}