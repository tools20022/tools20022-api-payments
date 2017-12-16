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
import com.tools20022.repository.GeneratedRepository;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	 * Investment account services for which rounding parameters are specified.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmInvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentAccountService";
			definition = "Investment account services for which rounding parameters are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmRoundingMethod;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmObject();
		}
	};
	protected DecimalNumber roundingModulus;
	/**
	 * Float value specifying the value to which rounding is required, eg, 10
	 * means round to a multiple of 10 units/shares, 0.5 means round to a
	 * multiple of 0.5 units/shares.
	 * <p>
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
	public static final MMBusinessAttribute mmRoundingModulus = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RoundingParameters.class.getMethod("getRoundingModulus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RoundingDirectionCode roundingDirection;
	/**
	 * Rounding direction applied to fractional numbers, eg, round up.
	 * <p>
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
	public static final MMBusinessAttribute mmRoundingDirection = new MMBusinessAttribute() {
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

		public Method getGetterMethod() {
			try {
				return RoundingParameters.class.getMethod("getRoundingDirection", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SecuritiesPegOrderInstruction relatedPegOrderInstruction;
	/**
	 * Peg order for which a rounding direction is provided.
	 * <p>
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
	public static final MMBusinessAssociationEnd mmRelatedPegOrderInstruction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPegOrderInstruction";
			definition = "Peg order for which a rounding direction is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmRoundDirection;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RoundingParameters";
				definition = "Parameters applied to a fractional number.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentAccountService.mmRoundingMethod, com.tools20022.repository.entity.SecuritiesPegOrderInstruction.mmRoundDirection);
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

	public void setInvestmentAccountService(com.tools20022.repository.entity.InvestmentAccountService investmentAccountService) {
		this.investmentAccountService = investmentAccountService;
	}

	public DecimalNumber getRoundingModulus() {
		return roundingModulus;
	}

	public void setRoundingModulus(DecimalNumber roundingModulus) {
		this.roundingModulus = roundingModulus;
	}

	public RoundingDirectionCode getRoundingDirection() {
		return roundingDirection;
	}

	public void setRoundingDirection(RoundingDirectionCode roundingDirection) {
		this.roundingDirection = roundingDirection;
	}

	public SecuritiesPegOrderInstruction getRelatedPegOrderInstruction() {
		return relatedPegOrderInstruction;
	}

	public void setRelatedPegOrderInstruction(com.tools20022.repository.entity.SecuritiesPegOrderInstruction relatedPegOrderInstruction) {
		this.relatedPegOrderInstruction = relatedPegOrderInstruction;
	}
}