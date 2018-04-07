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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PositionEffectCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the resulting position after a trade should be an opening
 * position or closing position.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffectCode#Open
 * PositionEffectCode.Open}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffectCode#Close
 * PositionEffectCode.Close}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffectCode#Rolled
 * PositionEffectCode.Rolled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffectCode#Fifo
 * PositionEffectCode.Fifo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffectCode#Lifo
 * PositionEffectCode.Lifo}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PositionEffectCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the resulting position after a trade should be an opening position or closing position."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PositionEffectCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Position after the trade should be open.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectCode
	 * PositionEffectCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position after the trade should be open."</li>
	 * </ul>
	 */
	public static final PositionEffectCode Open = new PositionEffectCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Open";
			definition = "Position after the trade should be open.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectCode.mmObject();
			codeName = "OPEN";
		}
	};
	/**
	 * Position after the trade should be closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectCode
	 * PositionEffectCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Close"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position after the trade should be closed."</li>
	 * </ul>
	 */
	public static final PositionEffectCode Close = new PositionEffectCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Close";
			definition = "Position after the trade should be closed.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectCode.mmObject();
			codeName = "CLOS";
		}
	};
	/**
	 * Results in a position obtained in a security previously held, sold and
	 * repurchased.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectCode
	 * PositionEffectCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rolled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Results in a position obtained in a security previously held, sold and repurchased."
	 * </li>
	 * </ul>
	 */
	public static final PositionEffectCode Rolled = new PositionEffectCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rolled";
			definition = "Results in a position obtained in a security previously held, sold and repurchased.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectCode.mmObject();
			codeName = "ROLL";
		}
	};
	/**
	 * First in, first out. Results in a position obtained after having sold in
	 * priority the securities bought chronologically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectCode
	 * PositionEffectCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fifo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First in, first out. Results in a position obtained after having sold in priority the securities bought chronologically."
	 * </li>
	 * </ul>
	 */
	public static final PositionEffectCode Fifo = new PositionEffectCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fifo";
			definition = "First in, first out. Results in a position obtained after having sold in priority the securities bought chronologically.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectCode.mmObject();
			codeName = "FIFO";
		}
	};
	/**
	 * Last in, last out. Results in a position obtained after having sold in
	 * priority the securities bought chronologically.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffectCode
	 * PositionEffectCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lifo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last in, last out. Results in a position obtained after having sold in priority the securities bought chronologically."
	 * </li>
	 * </ul>
	 */
	public static final PositionEffectCode Lifo = new PositionEffectCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lifo";
			definition = "Last in, last out. Results in a position obtained after having sold in priority the securities bought chronologically.";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffectCode.mmObject();
			codeName = "LIFO";
		}
	};
	final static private LinkedHashMap<String, PositionEffectCode> codesByName = new LinkedHashMap<>();

	protected PositionEffectCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PositionEffectCode";
				definition = "Indicates whether the resulting position after a trade should be an opening position or closing position.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PositionEffectCode.Open, com.tools20022.repository.codeset.PositionEffectCode.Close, com.tools20022.repository.codeset.PositionEffectCode.Rolled,
						com.tools20022.repository.codeset.PositionEffectCode.Fifo, com.tools20022.repository.codeset.PositionEffectCode.Lifo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Open.getCodeName().get(), Open);
		codesByName.put(Close.getCodeName().get(), Close);
		codesByName.put(Rolled.getCodeName().get(), Rolled);
		codesByName.put(Fifo.getCodeName().get(), Fifo);
		codesByName.put(Lifo.getCodeName().get(), Lifo);
	}

	public static PositionEffectCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PositionEffectCode[] values() {
		PositionEffectCode[] values = new PositionEffectCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PositionEffectCode> {
		@Override
		public PositionEffectCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PositionEffectCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}