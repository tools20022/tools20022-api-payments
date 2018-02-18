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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.Organisation14;

/**
 * In case of conflict between the Organisation Identification and the Full
 * Legal Name, it is recommended that the account servicer ask for clarification
 * by means of an AdditionalInformationRequest message.
 */
public class ConstraintOrganisationIdentificationRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.Organisation14 Organisation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of conflict between the Organisation Identification and the Full Legal Name, it is recommended that the account servicer ask for clarification by means of an AdditionalInformationRequest message."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forOrganisation14 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentificationRule";
			definition = "In case of conflict between the Organisation Identification and the Full Legal Name, it is recommended that the account servicer ask for clarification by means of an AdditionalInformationRequest message.";
			owner_lazy = () -> Organisation14.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkOrganisation14((Organisation14) obj);
		}
	};

	/**
	 * In case of conflict between the Organisation Identification and the Full
	 * Legal Name, it is recommended that the account servicer ask for
	 * clarification by means of an AdditionalInformationRequest message.
	 */
	public static void checkOrganisation14(Organisation14 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}