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
import com.tools20022.repository.other.SignatureEnvelopeReference;

/**
 * The XML Signature namespace ("http://www.w3.org/2000/09/xmldsig#") allows for
 * different XML elements to be root elements . This means the user has to
 * choose amongst these global elements which one to use as the root element.
 * Only the XML element Reference is allowed.
 */
public class ConstraintOnlyReferenceElement {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.other.SignatureEnvelopeReference
	 * SignatureEnvelopeReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlyReferenceElement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The XML Signature namespace (\"http://www.w3.org/2000/09/xmldsig#\") allows for different XML elements to be root elements . This means the user has to choose amongst these global elements which one to use as the root element. Only the XML element Reference is allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forSignatureEnvelopeReference = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlyReferenceElement";
			definition = "The XML Signature namespace (\"http://www.w3.org/2000/09/xmldsig#\") allows for different XML elements to be root elements . This means the user has to choose amongst these global elements which one to use as the root element. Only the XML element Reference is allowed.";
			owner_lazy = () -> SignatureEnvelopeReference.mmObject();
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkSignatureEnvelopeReference((SignatureEnvelopeReference) obj);
		}
	};

	/**
	 * The XML Signature namespace ("http://www.w3.org/2000/09/xmldsig#") allows
	 * for different XML elements to be root elements . This means the user has
	 * to choose amongst these global elements which one to use as the root
	 * element. Only the XML element Reference is allowed.
	 */
	public static void checkSignatureEnvelopeReference(SignatureEnvelopeReference obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}